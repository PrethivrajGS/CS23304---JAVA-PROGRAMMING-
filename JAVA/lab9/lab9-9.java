class NormalBloodPressureException extends Exception {
    public NormalBloodPressureException(String message) {
        super(message);
    }
}

class HighBloodPressureException extends Exception {
    public HighBloodPressureException(String message) {
        super(message);
    }
}

class LowBloodPressureException extends Exception {
    public LowBloodPressureException(String message) {
        super(message);
    }
}

class Patient {
    private String name;
    private int systolicBP;
    private int diastolicBP;

    public Patient(String name, int systolicBP, int diastolicBP) {
        this.name = name;
        this.systolicBP = systolicBP;
        this.diastolicBP = diastolicBP;
    }

    public void monitorBloodPressure() throws NormalBloodPressureException, HighBloodPressureException, LowBloodPressureException {
        if (systolicBP == 120 && diastolicBP == 80) {
            throw new NormalBloodPressureException("Blood pressure is normal.");
        } else if (systolicBP > 120 || diastolicBP > 80) {
            throw new HighBloodPressureException("Blood pressure is high.");
        } else if (systolicBP < 120 || diastolicBP < 80) {
            throw new LowBloodPressureException("Blood pressure is low.");
        }
    }
}

class PatientMonitor {
    public static void main(String[] args) {
        Patient patient = new Patient("John Doe", 130, 85);

        try {
            patient.monitorBloodPressure();
        } catch (NormalBloodPressureException e) {
            System.out.println(e.getMessage());
        } catch (HighBloodPressureException e) {
            System.out.println(e.getMessage());
        } catch (LowBloodPressureException e) {
            System.out.println(e.getMessage());
        }
    }
}