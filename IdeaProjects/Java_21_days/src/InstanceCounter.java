public class InstanceCounter {
    private static int numInstances = 0; // PRIVATE CLASS VARIABLE HOLDS N. OF OBJECTS

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Starting with " +
            InstanceCounter.getCount() + " objects");
        for (int  i = 0; i < 500; ++i) {
            new InstanceCounter();
        }
        System.out.println("Created " +
            InstanceCounter.getCount() + " objects");

        InstanceCounter ic = new InstanceCounter();
        System.out.println(ic.getCount());
        ic.addInstance();
        System.out.println(ic.getCount());
    }
}