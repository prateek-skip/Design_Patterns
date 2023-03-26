package Creational_Desgin_Patterns.Factory_Design_Pattern.Approach2;

enum PositionType {
    MANAGER {
        public IPosition title() {
            return new Manager();
        }
    },
    CLIENT {
        public IPosition title() {
            return new Client();
        }
    },
    DEV {
        public IPosition title() {
            return new DEV();
        }
    };
    public IPosition title() {
        return null;
    }
}

