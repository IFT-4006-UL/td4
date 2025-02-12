package srp;

import srp.exceptions.AucunSiegeDisponibleException;
import srp.exceptions.SiegeNonDisponibleException;

import java.util.List;

public class AssignateurDeSiegeSimple {
  private final VolRepository volRepository;

  public AssignateurDeSiegeSimple(VolRepository volRepository) {
    this.volRepository = volRepository;
  }

  public Siege assigner(int volId, PassagerType passagerType) {
    Vol vol = volRepository.findById(volId);

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