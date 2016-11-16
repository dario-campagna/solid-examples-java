package isp;

public class ISP {

    public interface Worker {

        void work();

    }

    public interface Eater {

        void eat();

    }

    public class Human implements Worker, Eater {

        @Override
        public void work() {
            // ...working
        }

        @Override
        public void eat() {
            // ...eating during break
        }
    }

    public class SuperHuman implements Worker, Eater {

        @Override
        public void work() {
            // ...working much more
        }

        @Override
        public void eat() {
            // ...eating during break
        }
    }

    public class Robot implements Worker {

        @Override
        public void work() {
            // ...working
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
