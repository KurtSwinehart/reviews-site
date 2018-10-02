package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review cancun = new Review(1L, "Cancun", "Cancun Resort Options", "Cancun Content", "/images/cancun1.jpg");
		Review jamaica = new Review(2L, "Jamaica", "Jamaica Resort Options", "Jamaica Content", "/images/jamaica1.jpg");
		Review cuba = new Review(3L, "Cuba", "Cuba Resort Options", "Cuba Content", "/images/cuba1.jpg");
		Review guatemala = new Review(4L, "Guatemala", "Guatemala Resort Options", "Guatemala Content",
				"/images/guate1.jpg");
		Review puertoRico = new Review(5L, "Puerto Rico", "Puerto Rico Resort Options", "PR Content",
				"/images/puertorico1.jpg");

		reviewList.put(cancun.getId(), cancun);
		reviewList.put(jamaica.getId(), jamaica);
		reviewList.put(cuba.getId(), cuba);
		reviewList.put(guatemala.getId(), guatemala);
		reviewList.put(puertoRico.getId(), puertoRico);
	}

	// constructor for test purposes
	public ReviewRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
	}

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

}
