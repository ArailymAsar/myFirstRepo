package task6;

public class Block {

    private int width;

    private int length;

    private int height;

    private int Volume;

    private int SurfaceArea;

    public Block (int[] block){
        this.width = block[0];
        this.length = block[1];
        this.height = block[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return Volume = this.height * this.length * this.width;
    }

    public int getSurfaceArea() {
        return SurfaceArea = ((this.height * this.length) + (this.width * this.length) + (this.height* this.width)) * 2;
    }
}
