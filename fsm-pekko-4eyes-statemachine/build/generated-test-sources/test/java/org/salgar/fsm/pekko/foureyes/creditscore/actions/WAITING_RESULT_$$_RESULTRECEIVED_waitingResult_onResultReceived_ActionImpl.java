package org.salgar.fsm.pekko.foureyes.creditscore.actions;

import org.apache.pekko.actor.typed.scaladsl.ActorContext;
import org.salgar.fsm.pekko.foureyes.creditscore.CreditScoreSM;

import java.util.Map;

public class WAITING_RESULT_$$_RESULTRECEIVED_waitingResult_onResultReceived_ActionImpl
    extends WAITING_RESULT_$$_RESULTRECEIVED_waitingResult_onResultReceived_Action {

    @Override
    protected Map<String, Object> processCustomAction(ActorContext<CreditScoreSM.CreditScoreSMEvent> actorContext,
                                                        Map<String, Object> controlObject,
                                                        Map<String, Object> payload) {
        return payload;
    }
}
