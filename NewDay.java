abstract class Camera{
    
    public abstract void takeVideo();
    
    void takePicture(){
        System.out.println("take Picture working");
    }

}




// interface Camera
// {
//     void takePicture();
// }

// class iPhoneCamera implements Camera
// {
//     public void takePicture()
//     {
//         System.out.println("Highest Quality");

//     }
// }

// class androidCamera implements Camera
// {
//     public void takePicture()
//     {
//         System.out.println("High Quality");

//     }
// }

// class Photographer
// {
//     public void snap(Camera cam)
//     {
//         cam.takePicture();
//     }
// }


public class NewDay {
    public static void main(String[] args)
    {

        Camera c = new Camera(){

            public void takeVideo(){
                System.out.println("taking Video");
            }
        };


        Camera d = new Camera(){

            public void takeVideo(){
                System.out.println("taking Video");
            }
        };

        c.takeVideo();
        c.takePicture();

        d.takeVideo();
        d.takePicture();


        // Camera cam = new Camera();
        // Camera iph = new iPhoneCamera();
        // Camera and = new androidCamera();

        // Photographer kosi = new Photographer();
        // kosi.snap(iph);

    
        
    }
}