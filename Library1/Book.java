package MitJava;

	public class Book {

		Boolean isCheckedOut = false;
		String titleofbook;

		public Book(String title) {
			titleofbook = title;
		}

		public void Borrow() {
			isCheckedOut = true;
		}

		public void Return() {
			isCheckedOut = false;
		}

		public boolean isBorrowed() {
			if (isCheckedOut == true) {
				return true;
			} else {
				return false;
		}
	}

		public String getTitle() {
			return titleofbook;
		}
}
