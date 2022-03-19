package pro.sky.java.course2;

public class TypeOfTransport {
    private String modelName;
    private int wheelsCount;

    public TypeOfTransport(String modelName, int wheelsCount) {
        this.setModelName(modelName);
        this.setWheelsCount(wheelsCount);
    }

    public TypeOfTransport() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
