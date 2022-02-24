package it.pagopa.pn.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class NewNotificationResponse {

    @Schema( name = "notificationId", description = "Identificativo di correlazione della notifica")
    private String notificationId;

    @Schema( name = "paNotificationId", description = "Identificativo inviato dalla pubblica amministrazione")
    private String paNotificationId;

}
