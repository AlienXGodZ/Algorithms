import java.util.PriorityQueue;

class Node {

    char character;
    int frequency;

    Node left;
    Node right;

    Node(char character, int frequency) {

        this.character = character;
        this.frequency = frequency;

    }

    Node(int frequency, Node left, Node right) {

        this.character = '\0';
        this.frequency = frequency;
        this.left = left;
        this.right = right;

    }

    boolean isleaf() {

        return left == null && right == null;

    }
}

public class Test44{

    public static void printcodes(Node root,String code){

        if(root == null){

            return;

        }

        if(root.isleaf()){

            System.out.println(root.character + " = " + code);
            return;
        }

        printcodes(root.left,code + "0");
        printcodes(root.right,code + "1");


    }

    public static void main(String[] args){

        char[] characters = {'A','B','C','D'};

        int[] frequency = {8,4,2,1};

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.frequency,b.frequency));

        for(int i = 0 ; i < frequency.length; i++){

            pq.add(new Node(characters[i],frequency[i]));

        }

        while(pq.size() > 1){

            Node first = pq.poll();
            Node second = pq.poll();

            Node parent = new Node(first.frequency + second.frequency ,first,second);

            pq.add(parent);
        }

         Node root = pq.poll();

        System.out.println("Huffman Codes:");
        printcodes(root,"");







    }
}