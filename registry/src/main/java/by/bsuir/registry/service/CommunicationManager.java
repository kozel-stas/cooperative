package by.bsuir.registry.service;

import by.bsuir.registry.exceptions.DataManipulateException;
import by.bsuir.registry.model.Communication;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Collection;

@ParametersAreNonnullByDefault
public interface CommunicationManager extends BaseManager<Communication> {

    Collection<Communication> findByPersonId(String id) throws DataManipulateException;

    void delete(Communication communication) throws DataManipulateException;

}
