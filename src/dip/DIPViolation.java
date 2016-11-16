package dip;

public class DIPViolation {

    public class Human {

        public void work() {
            // ...working
        }

    }

    public class Manager {

        private Human worker;

        public void setWorker(Human worker) {
            this.worker = worker;
        }

        public void manage() {
            worker.work();
        }
    }

    public class Robot {

        public void work() {
            // ...working longer
        }

    }

}
