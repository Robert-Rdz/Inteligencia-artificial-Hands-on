public class Main {
    public static void main(String[] args) {
        Nodo nodo1 = new Nodo("NY", 3);
        Nodo nodo2 = new Nodo("TOR", 4);
        Nodo nodo3 = new Nodo("CHI", 5);
        Nodo nodo4 = new Nodo("DEN", 8);
        Nodo nodo5 = new Nodo("HW", 6);
        Nodo nodo6 = new Nodo("URB", 0);
        Nodo nodo7 = new Nodo("CALG", 2);
        Nodo nodo8 = new Nodo("LA", 10);

        nodo1.agregarDescendiente(nodo2);
        nodo1.agregarDescendiente(nodo3);
        nodo1.agregarDescendiente(nodo4);

        nodo2.agregarDescendiente(nodo7);

        nodo3.agregarDescendiente(nodo4);

        nodo4.agregarDescendiente(nodo5);
        nodo4.agregarDescendiente(nodo8);

        nodo5.agregarDescendiente(nodo6);
        nodo5.agregarDescendiente(nodo8);

        HillClimbing hillClimbing = new HillClimbing(nodo1, nodo8);
        hillClimbing.buscar();
    }
}

        /*Nodo nodo1 = new Nodo("Oradea", 5);
        Nodo nodo2 = new Nodo("Zerind", 3);
        Nodo nodo3 = new Nodo("Arad", 7);
        Nodo nodo4 = new Nodo("Timisoara", 5);
        Nodo nodo5 = new Nodo("Lugoj", 3);
        Nodo nodo6 = new Nodo("Mehadia", 7);
        Nodo nodo7 = new Nodo("Drobeta", 5);
        Nodo nodo8 = new Nodo("Craiova", 3);
        Nodo nodo9 = new Nodo("Rimnicu Vilcea", 7);
        Nodo nodo10 = new Nodo("Sibiu", 5);
        Nodo nodo11 = new Nodo("Fagaras", 3);
        Nodo nodo12 = new Nodo("Bucharest", 7);
        Nodo nodo13 = new Nodo("Pitesti", 1);
        Nodo nodo14 = new Nodo("Giurgiu", 90);
        Nodo nodo15 = new Nodo("Urziceni", 85);
        Nodo nodo16 = new Nodo("Hirsova", 98);
        Nodo nodo17 = new Nodo("Eforie", 86);
        Nodo nodo18 = new Nodo("Vaslui", 142);
        Nodo nodo19 = new Nodo("Iasi", 92);
        Nodo nodo20 = new Nodo("Neamt", 87);
         */
