package academy.learnprogramming;

import java.util.Locale;

public class Car {
        //state of the car/defined as fields
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String colour;

        //methods
        public void setModel(String model){
                String validModel = model.toLowerCase();
                if(validModel.equals("carrera") || validModel.equals("commodore")){
                        this.model = model;
                }
                else{
                        this.model = "unknown";
                }
        }

        public String getModel(){
                return this.model;
        }
}



