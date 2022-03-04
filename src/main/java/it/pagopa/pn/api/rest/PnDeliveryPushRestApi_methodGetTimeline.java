package it.pagopa.pn.api.rest;

import it.pagopa.pn.api.dto.notification.timeline.TimelineElement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public interface PnDeliveryPushRestApi_methodGetTimeline {

    @GetMapping(PnDeliveryPushRestConstants.TIMELINE_BY_IUN)
    ResponseEntity<Set<TimelineElement>> getTimelineElements(
            @PathVariable( name = "iun") String iun
    );
}