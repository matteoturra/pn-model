package it.pagopa.pn.api.dto.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class StandardEventHeader {

    public static final String PN_EVENT_HEADER_PUBLISHER = "publisher";
    public static final String PN_EVENT_HEADER_EVENT_ID = "eventId";
    public static final String PN_EVENT_HEADER_EVENT_TYPE = "eventType";
    public static final String PN_EVENT_HEADER_IUN = "iun";
    public static final String PN_EVENT_HEADER_CREATED_AT = "createdAt";

    @Schema( name = PN_EVENT_HEADER_PUBLISHER, description = "L'applicazione che ha creato l'evento")
    @JsonProperty( PN_EVENT_HEADER_PUBLISHER )
    private String publisher;

    @Schema( name = PN_EVENT_HEADER_EVENT_ID, description = "Identificativo univoco deterministico dell'evento, determinato dallo iun e dal payload dell'evento")
    @JsonProperty( PN_EVENT_HEADER_EVENT_ID )
    private String eventId;

    @Schema( name = PN_EVENT_HEADER_EVENT_TYPE, description = "")
    @JsonProperty( PN_EVENT_HEADER_EVENT_TYPE )
    private EventType eventType;

    @Schema( name = PN_EVENT_HEADER_IUN, description = "Un messaggio è sempre collegato a una notifica")
    private String iun;

    @Schema( name = PN_EVENT_HEADER_CREATED_AT, description = "Istante di creazione del messaggio")
    @JsonProperty( PN_EVENT_HEADER_CREATED_AT )
    private Instant createdAt;
}
