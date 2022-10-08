package task6;

public class Main {
    public static void main(String[] args) {
        Block b = new Block(new int[]{2, 4, 6});
        System.out.println(b.getHeight());
        System.out.println(b.getLength());
        System.out.println(b.getWidth());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());

        Employee first = new Employee("Sam", 'M', 30, 1990, 12000);
        Employee second = new Employee("Sam", 'M', 34, 1992, 13000);
        System.out.println(first.getName());
        System.out.println(first.isSameName(second.getEmployee()));


    }
}
