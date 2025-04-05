interface Printer {
    void print(String document);
}

class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("Printing with Inkjet: " + document);
    }
}
