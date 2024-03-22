package org.example;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

}