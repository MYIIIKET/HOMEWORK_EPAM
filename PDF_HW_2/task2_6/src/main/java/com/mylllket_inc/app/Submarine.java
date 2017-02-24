package com.mylllket_inc.app;

public class Submarine {
    private Engine engine;
    private boolean status = false;

    public static class Engine {
        private String enType;
        private int enPower;

        public static class Builder implements EngineStruct {
            private String enType;
            private Number enPower;

            public Builder(String enType, Number enPower) {
                setPower(enPower);
                setType(enType);
            }

            public void setType(String data) {
                this.enType = data;
            }

            public void setPower(Number data) {
                this.enPower = data;
            }

            public Engine BuildEngine() {
                return new Engine(this);
            }
        }

        public Engine(Builder builder) {
            this.enType = builder.enType;
            this.enPower = builder.enPower.intValue();
        }

        public Submarine BuildSubmarine() {
            return new Submarine(this);
        }
    }

    private Submarine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.status = true;
    }

    public void stop() {
        this.status = false;
    }

    public String getStatus() {
        StringBuilder result = new StringBuilder();
        result.append("EngineType: " + this.engine.enType +
                "\nEnginePower: " + this.engine.enPower +
                "\nStatus: " + ((status) ? "Go" : "Stop\n\n"));
        return result.toString();
    }

}
