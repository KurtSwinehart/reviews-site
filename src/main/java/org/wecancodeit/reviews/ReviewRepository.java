package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewRepository() {
		Review cancun = new Review(1L, "Cancun", "Cancun Description");
		Review jamaica = new Review(2L, "Jamaica", "Jamaica Description");
		Review cuba = new Review(3L, "Cuba", "Cuba Description");
		Review guatemala = new Review(4L, "Guatemala", "Guatemala Description");
		Review puertoRico = new Review(5L, "Puerto Rico", "Puerto Rico Description");

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
