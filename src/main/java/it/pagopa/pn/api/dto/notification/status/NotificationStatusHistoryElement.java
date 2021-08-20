package it.pagopa.pn.api.dto.notification.status;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import it.pagopa.pn.api.dto.notification.NotificationJsonViews;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NotificationStatusHistoryElement {

    @Schema( description = "Stato di avanzamento del processo di notifica")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private NotificationStatus status;

    @Schema( description = "data e roa di raggiungimento dello stato di avanzamento")
    @JsonView(value = { NotificationJsonViews.Sent.class, NotificationJsonViews.Received.class})
    private Instant activeFrom;
}
