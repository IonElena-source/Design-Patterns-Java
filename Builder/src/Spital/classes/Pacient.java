package Spital.classes;

public class Pacient {
    private  boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalatPentruInterior;

     Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalatPentruInterior) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

     void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

     void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

     void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

     void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatPentruInterior=").append(areHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
