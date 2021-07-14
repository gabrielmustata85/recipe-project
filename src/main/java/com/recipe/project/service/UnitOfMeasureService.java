package com.recipe.project.service;

import com.recipe.project.commands.UnitOfMeasureCommand;
import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
