import java.util.LinkedList;

public class Homer {
    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();

        //1) adicionar Homer e Marge na lista e imrpimir 
        lista.add("Homer");
        lista.add("Marge");
        System.out.println("1) " + lista);

        //2) esvaziar e imprimir a lista
        lista.clear();
        System.out.println("2) " + lista);

        //3) adicionar Homer na lists, depois Bart na posição 0 e Moll na posição 1
        lista.add("Homer");
        lista.add(0, "Bart"); // index primeiro e elemento depois
        lista.add(1, "Moll");
        System.out.println("3) " + lista);

        //4) esvaziar a lista
        lista.clear();

        //5) adicionar Homer e Bart na lista e add Lisa no inicio, imprimir resultado e imprimir
        lista.add("Homer");
        lista.add("Bart");
        lista.add(0, "Lisa");
        System.out.println("5) " + lista + " Tamanho: " + lista.size());

        //6) esvaziar e imprimir a lista
        lista.clear();
        System.out.println("6)" + lista);

        //7) adicionar Homer, Maggie na lista, depois add Bart na posição 0 e Marge na posição 1,verificar se Lisa esta na lista
        lista.add("Homer");
        lista.add("Maggie");
        lista.add(0, "Bart");
        lista.add(1, "Marge");
        System.out.println("7) " + lista + " Lisa está na lista? " + lista.contains("Lisa")); //contains verifica se o objeto está na lista

        //8) esvaziar lista
        lista.clear();

        //9) adicionar Homer e Bart na lista e imprimir o resultado e o tamanho da lista
        lista.add("Homer");
        lista.add("Bart");
        System.out.println("9) " + lista + " Tamanho: " + lista.size());

        //10) verificar de Marge, Homer, Bart e Maggie estao na lista e imprimir o resultado e o tamanho da lista
        System.out.println("10) Marge está na lista?" + lista.contains("Marge") + "\nHomer está na lista?" + lista.contains("Homer") + "\nBart está na lista?" + lista.contains("Bart") + "\nMaggie está na lista?" +  lista.contains("Maggie") + "\nTamanho: " + lista.size());
        
        //11) esvaiar a lista
        lista.clear();

        //12) adicionar Homer e Bart no começo da lista, depois adicionar Marge e depois Maggie na posição 1 e dps Ned Flanders no começço da lista e sr. Burns no final da lista
        lista.add("Homer");
        lista.add("Bart");
        lista.add("Marge");
        lista.add(1, "Maggie");
        lista.addFirst("Ned Flanders"); // addFirst -> adiciona no primeiro
        lista.addLast("Sr. Burns"); // addLast -> adiciona no ultimo
        System.out.println("11) " + lista);

        //13) remover do fim da lista e imprimir a lista
        lista.removeLast(); // remove o ultimo(Last)
        System.out.println("13) " + lista);  
        
        //14) remover a posição 1, depois imprimir a lista e o tamanho da lista
        lista.remove(1);
        System.out.println("14) " + lista + "Tamanho: " + lista.size());

        //15) verificar se Marge, Homer, Bart e Maggie estão na lista e imprimir o resultado e o tamanho da lista
        System.out.println("15) Marge está na lista? " + lista.contains("Marge") + "\nHomer está na lista?" + lista.contains("Homer") + "\nBart está na lista?" + lista.contains("Bart") + "\nMaggie está na lista?" + lista.contains("Maggie") + "\nTamanho: " + lista.size());
    
        //16) remover do começo da lista, depois imprimir a lista e o tamanho da lista
        lista.removeFirst();
        System.out.println("16) " + lista + "Tamanho: " + lista.size());

        //17) verificar se Marge, Homer, Bart e Maggie estão na lista e imprima os resultados e o tamanho da lista
        System.out.println("17) Marge está na lista? " + lista.contains("Marge") + "\nHomer está na lista?" + lista.contains("Homer") + "\nBart está na lista?" + lista.contains("Bart") + "\nMaggie está na lista?" + lista.contains("Maggie") + "\nTamanho: " + lista.size());


        //18) esvaziar e imprimir a lista
        lista.clear();
        System.out.println("18) " + lista);
    }
    
}
