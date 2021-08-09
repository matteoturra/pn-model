package it.pagopa.pn.api.dto.notification;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
public class NotificationSender {

    @Schema( name = "paId", description = "Identificativo IPA della PA")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Received.class})
    private String paId;

    @Schema( name = "paDenomination", description = "Denominazione IPA della PA mittente")
    @JsonView(value = { NotificationJsonViews.New.class, NotificationJsonViews.Received.class})
    private String paDenomination;

}
