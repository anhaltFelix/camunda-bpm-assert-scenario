package org.camunda.bpm.scenario.impl;

import org.camunda.bpm.engine.history.HistoricActivityInstance;
import org.camunda.bpm.scenario.Scenario;
import org.camunda.bpm.scenario.action.ScenarioAction;

import java.util.Map;

/**
 * @author Martin Schimak <martin.schimak@plexiti.com>
 */
public class IgnoredWaitstate extends ExecutableWaitstate<Object> {

  protected IgnoredWaitstate(ProcessRunnerImpl runner, HistoricActivityInstance instance, String duration) {
    super(runner, instance, duration);
  }

  @Override
  public void execute() {
  }

  @Override
  protected ScenarioAction<IgnoredWaitstate> action(Scenario.Process scenario) {
    return null;
  }

  @Override
  protected void leave() {
    throw new UnsupportedOperationException();
  }

  @Override
  protected void leave(Map variables) {
    throw new UnsupportedOperationException();
  }

  @Override
  protected Object getRuntimeDelegate() {
    return null;
  }

}
