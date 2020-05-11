package umari.datafilter.quickstart.rest.udf;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import umari.datafilter.core.Aggregable;
import umari.datafilter.core.UdfRequest;
import umari.datafilter.quickstart.domain.summary.BookSummary;
import umari.datafilter.service.UdfTemplate;

@RestController
@RequestMapping("/api/udf/books")
public class BookRest {

    @Autowired
    private UdfTemplate udfTemplate;

    /**
     * Endpoint for filter requests for the Book entity.
     *
     * @param udfRequest
     * @param pageable
     * @return
     */
    @PostMapping
    public ResponseEntity<Page<?>> filter(@RequestBody UdfRequest udfRequest, Pageable pageable, LocalDateTime date) {
    	System.out.println(date.getYear());
        return ResponseEntity.ok(udfTemplate.filter(
        		BookSummary.class,
                udfRequest.getFilterable(),
                pageable));
    }

    /**
     * Endpoint for aggreation requests for the Book entity.
     *
     * <code>
     * 	{
     * 		"aggregables" : [{
     * 			"selector": "id",
     * 			"operation": "count"
     * 		}]
     * 	}
     * </code>
     *
     * @param udfRequest
     * @return
     */
    @PostMapping("/agg")
    public ResponseEntity<?> aggreate(@RequestBody UdfRequest udfRequest) {
        return ResponseEntity.ok(udfTemplate.aggregate(
        		BookSummary.class,
                udfRequest.getFilterable(),
                udfRequest.getAggregables().toArray(new Aggregable[]{})));
    }

}
