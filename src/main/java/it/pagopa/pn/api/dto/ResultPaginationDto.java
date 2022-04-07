package it.pagopa.pn.api.dto;

import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ResultPaginationDto<R,K> {
    private List<R> result;
    private boolean moreResult;
    private List<K> nextPagesKey;
}
