package commandPattern;

public class RobotVacuum {
	
	    private boolean isCleaning = false;

	    public void startCleaning() {
	        isCleaning = true;
	        System.out.println("Robot vacuum has started cleaning.");
	        System.out.println();
	    }


		public void stopCleaning() {
			 isCleaning = false;
		        System.out.println("Robot vacuum has stopped cleaning.");
		        System.out.println();
			
		}
	}

