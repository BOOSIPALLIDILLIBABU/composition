package oops.composition;

public class CompositionEx {
      public static void main(String[] args) {
    	 
    	  Battery batteryy=new Battery("dkild",1,15);
    	  
    	  Camera VivoCamera=new Camera(200,100);
	
    Mobile motorola=new Mobile("Vivo","isenn55555","Android", batteryy, VivoCamera);
	 
	 System.out.println("*******Moto mobile*******");
	 
	 System.out.println("IMEINumber "+ motorola.getIMEINumber());
	 System.out.println("brandName"+ motorola.getBrandName()); 
	 System.out.println("os"+ motorola.getOs()); 
	 
	 System.out.println("*****Battery space *****");
	 
	 Battery battery = motorola.getBattery();
	 
	 System.out.println("Brandname:"+ battery.getBrandName());
	 System.out.println("hourseToCharge:"+ battery.getHourseToCharge());
	 System.out.println("hourseToLive:"+ battery.getHourseToLive());
	 
	 System.out.println("*****ViVoCamera******");
	 
	 Camera camera=motorola.getCamera(); 
	 
	 System.out.println("megaPixelFront:"+ camera.getMegaPixelFront());
	 System.out.println("megaPixelRear:"+ camera.getMegaPixelRear());
	 
	 
} 
   
}
