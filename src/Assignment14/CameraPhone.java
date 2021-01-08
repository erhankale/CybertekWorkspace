package Assignment14;

public class CameraPhone {
    int imageSize;
    int memorySize;

    public CameraPhone(int imageSize, int memorySize){
        this.imageSize=imageSize;
        this.memorySize=memorySize;
    }

    public int numPictures(){
        return memorySize*1000/imageSize;
    }
}
