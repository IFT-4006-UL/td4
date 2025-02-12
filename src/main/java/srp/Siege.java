package srp;

public class Siege {
    private boolean disponible;
    private PassagerType type;

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean nouvelleDisponibilite) {
        disponible = nouvelleDisponibilite;
    }

    public PassagerType getType() {
        return type;
    }
}
