package it.pagopa.pn.api.dto.legalfacts;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Value;

/**
 * https://docs.google.com/document/d/1wJ2TGGOoFDMlFqEf9VpraKC8yKn3Nrr24Z1kNeMBbPw
 * 3. Attestazione (lett. d)
 */
@Value
@Builder( toBuilder = true )
public class DigitalProcessFallbackLegalFact {

    @Schema( name = "iun", description = "IUN della notifica di cui quest atto attesta l'affidamento a PN")
    private String iun;

    @Schema( name = "date", description = "Data in cui il sistema di messaggistica conferma il recapito o l'impossibilità di recapitare il messaggio")
    private Integer date;

    @Schema( name = "recipient", description = "Dati del destinatario")
    private RecipientInfo recipient;

    @Schema( name = "digitalAddress", description = "Rappresentazione in stringa dell'indirizzo digitale")
    private String digitalAddress;

    @Schema( name = "physicalAddress", description = "Rappresentazione in stringa dell'indirizzo fisico")
    private String physicalAddress;

}