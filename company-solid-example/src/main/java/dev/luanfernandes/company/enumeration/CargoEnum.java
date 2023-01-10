package dev.luanfernandes.company.enumeration;


public enum CargoEnum {
    ASSISTENTE {
        @Override
        public CargoEnum getProximoCargo() {
            return ANALISTA;
        }
    },
    ANALISTA {
        @Override
        public CargoEnum getProximoCargo() {
            return ESPECIALISTA;
        }
    },
    ESPECIALISTA {
        @Override
        public CargoEnum getProximoCargo() {
            return GERENTE;
        }
    },
    GERENTE {
        @Override
        public CargoEnum getProximoCargo() {
            return GERENTE;
        }
    };

    public abstract CargoEnum getProximoCargo();
}
