class Review {
    id: number;
    userEmail: string;
    date: string;
    rating: number;
    productId: number;
    reviewDescription?: string;

    constructor(
        id: number,
        userEmail: string,
        date: string,
        rating: number,
        productId: number,
        reviewDescription: string) {
        this.id = id;
        this.userEmail = userEmail;
        this.date = date;
        this.rating = rating;
        this.productId = productId;
        this.reviewDescription = reviewDescription;
    }
}

export default Review;