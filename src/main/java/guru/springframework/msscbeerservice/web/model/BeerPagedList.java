package guru.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDto> {

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public BeerPagedList(@JsonCreator("content") List<BeerDto> content,
                         @JsonCreator("number") int number,
                         @JsonCreator("size") int size,
                         @JsonCreator("totalElements") Long totalElements,
                         @JsonCreator("pageable") JsonNode pageable,
                         @JsonCreator("last") boolean last,
                         @JsonCreator("totalPages") int totalPages,
                         @JsonCreator("sort") JsonNode sort,
                         @JsonCreator("first") boolean first,
                         @JsonCreator("numberOfElements") int numberOfElements) {
        super(content, PageRequest.of(number, size), totalElements);
    }

    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}
