package ENUM_JAVA;

public class Pizza {
    private PizzaStatus status;

    public enum PizzaStatus {

        ORDERED(5) {
            @Override
            public boolean isOrdered(){
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady(){
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered(){
            return false;
        }

        public boolean isReady(){
            return false;
        }

        PizzaStatus(int timeToDelivery){
            this.timeToDelivery = timeToDelivery;
        }

        public int getTimeToDelivery() {
            return this.timeToDelivery;
        }
    }

    public boolean isDeliverable(){
        return this.status.isReady();
    }

    public void printTimeToDelivery(){
        System.out.println("Time to delivery: "+ status.getTimeToDelivery());
    }

    public void setStatus(PizzaStatus status){
        this.status = status;
    }
}
