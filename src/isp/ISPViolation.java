package isp;

public class ISPViolation {

    public interface Worker {

        void work();

        void eat();

    }

    public class Human implements Worker {

        @Override
        public void work() {
            // ...working
        }

        @Override
        public void eat() {
            // ...eating during break
        }
    }

    public class SuperHuman implements Worker {

        @Override
        public void work() {
            // ...working much more
        }

        @Override
        public void eat() {
            // ...eating during break
        }
    }

    public class Manager {

        private Worker worker;

        public void setWorker(Worker worker) {
            this.worker = worker;
        }

        public void manage() {
            worker.work();
        }
    }

}
