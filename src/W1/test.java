package W1;

public class test {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        System.out.println(builder.capacity());

        builder.append("Hello ");
        System.out.println(builder.capacity());

        builder.append("World. This is java");
        System.out.println(builder.capacity());
    }
}
