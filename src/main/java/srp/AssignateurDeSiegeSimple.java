package srp;

import srp.exceptions.AucunSiegeDisponibleException;
import srp.exceptions.SiegeNonDisponibleException;

import java.util.List;

public class AssignateurDeSiegeSimple {
  private final BaseDeDonnees baseDeDonnees;

  public AssignateurDeSiegeSimple(BaseDeDonnees baseDeDonnees) {
    this.baseDeDonnees = baseDeDonnees;
  }

  public Siege assigner(int volId, PassagerType passagerType) {
    String req = "SELECT * FROM t_vol WHERE id=" + volId + ";";
    Vol vol = (Vol) baseDeDonnees.execute(req);

    List<Siege> sieges = vol.getSieges();

    for(Siege siege: sieges) {
      try {
        essayerAssignerCeSiege(siege, passagerType);
        return siege;
      } catch(SiegeNonDisponibleException e) {
      }
    }

    throw new AucunSiegeDisponibleException();
  }

  private void essayerAssignerCeSiege(Siege siege, PassagerType passagerType) {
    if(siege.getDisponible() && siege.getType() == passagerType) {
      siege.setDisponible(false);
    } else {
      throw new SiegeNonDisponibleException();
    }
  }

}