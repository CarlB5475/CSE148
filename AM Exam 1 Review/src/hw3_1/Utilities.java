package hw3_1;

import java.util.Random;

public class Utilities {
	private static Textbook[] bookStore;
	private static Instructor[] instructorStore;

	public static Course emitCourse() {
		return null;
	}

	public static Course[] emitCourses(int upperBound) {
		return null;
	}

	public static String emitDescription(int numberOfWords) {
		String words = "Tom exhibited. They were satisfactory, and the property changed hands.\r\n"
				+ "Then Tom traded a couple of white alleys for three red tickets, and some\r\n"
				+ "small trifle or other for a couple of blue ones. He waylaid other\r\n"
				+ "boys as they came, and went on buying tickets of various colors ten\r\n"
				+ "or fifteen minutes longer. He entered the church, now, with a swarm\r\n"
				+ "of clean and noisy boys and girls, proceeded to his seat and started\r\n"
				+ "a quarrel with the first boy that came handy. The teacher, a grave,\r\n"
				+ "elderly man, interfered; then turned his back a moment and Tom pulled a\r\n"
				+ "boy's hair in the next bench, and was absorbed in his book when the boy\r\n"
				+ "turned around; stuck a pin in another boy, presently, in order to hear\r\n"
				+ "him say “Ouch!” and got a new reprimand from his teacher. Tom's whole\r\n"
				+ "class were of a pattern--restless, noisy, and troublesome. When they came\r\n"
				+ "to recite their lessons, not one of them knew his verses perfectly, but\r\n"
				+ "had to be prompted all along. However, they worried through, and each\r\n"
				+ "got his reward--in small blue tickets, each with a passage of Scripture\r\n"
				+ "on it; each blue ticket was pay for two verses of the recitation. Ten\r\n"
				+ "blue tickets equalled a red one, and could be exchanged for it; ten red\r\n"
				+ "tickets equalled a yellow one; for ten yellow tickets the superintendent\r\n"
				+ "gave a very plainly bound Bible (worth forty cents in those easy\r\n"
				+ "times) to the pupil. How many of my readers would have the industry and\r\n"
				+ "application to memorize two thousand verses, even for a Dore Bible? And\r\n"
				+ "yet Mary had acquired two Bibles in this way--it was the patient work of\r\n"
				+ "two years--and a boy of German parentage had won four or five. He once\r\n"
				+ "recited three thousand verses without stopping; but the strain upon his\r\n"
				+ "mental faculties was too great, and he was little better than an idiot\r\n"
				+ "from that day forth--a grievous misfortune for the school, for on great\r\n"
				+ "occasions, before company, the superintendent (as Tom expressed it)\r\n"
				+ "had always made this boy come out and “spread himself.” Only the older\r\n"
				+ "pupils managed to keep their tickets and stick to their tedious work\r\n"
				+ "long enough to get a Bible, and so the delivery of one of these prizes\r\n"
				+ "was a rare and noteworthy circumstance; the successful pupil was so\r\n"
				+ "great and conspicuous for that day that on the spot every scholar's\r\n"
				+ "heart was fired with a fresh ambition that often lasted a couple\r\n"
				+ "of weeks. It is possible that Tom's mental stomach had never really\r\n"
				+ "hungered for one of those prizes, but unquestionably his entire being\r\n"
				+ "had for many a day longed for the glory and the eclat that came with it.\r\n" + "\r\n"
				+ "In due course the superintendent stood up in front of the pulpit, with\r\n"
				+ "a closed hymn-book in his hand and his forefinger inserted between its\r\n"
				+ "leaves, and commanded attention. When a Sunday-school superintendent\r\n"
				+ "makes his customary little speech, a hymn-book in the hand is as\r\n"
				+ "necessary as is the inevitable sheet of music in the hand of a singer\r\n"
				+ "who stands forward on the platform and sings a solo at a concert--though\r\n"
				+ "why, is a mystery: for neither the hymn-book nor the sheet of music\r\n"
				+ "is ever referred to by the sufferer. This superintendent was a slim\r\n"
				+ "creature of thirty-five, with a sandy goatee and short sandy hair; he\r\n"
				+ "wore a stiff standing-collar whose upper edge almost reached his ears\r\n"
				+ "and whose sharp points curved forward abreast the corners of his mouth--a\r\n"
				+ "fence that compelled a straight lookout ahead, and a turning of the\r\n"
				+ "whole body when a side view was required; his chin was propped on a\r\n"
				+ "spreading cravat which was as broad and as long as a bank-note, and had\r\n"
				+ "fringed ends; his boot toes were turned sharply up, in the fashion\r\n"
				+ "of the day, like sleigh-runners--an effect patiently and laboriously\r\n"
				+ "produced by the young men by sitting with their toes pressed against a\r\n"
				+ "wall for hours together. Mr. Walters was very earnest of mien, and very\r\n"
				+ "sincere and honest at heart; and he held sacred things and places\r\n"
				+ "in such reverence, and so separated them from worldly matters, that\r\n"
				+ "unconsciously to himself his Sunday-school voice had acquired a peculiar\r\n"
				+ "intonation which was wholly absent on week-days. He began after this\r\n" + "fashion:";
		String[] wordArr = words.split(" ");
		String description = "";
		for(int i = 0; i < numberOfWords; i++) {
			description += (wordArr[(int)(Math.random()* wordArr.length)]).trim() + " ";
		}
		
		return description;
	}

	public static Name emitName() {
		String[] firstNames = { "f1", "f2", "f3", "f4" };
		String[] lastNames = { "l1", "l2", "l3", "l4" };
		String fn = firstNames[new Random().nextInt(firstNames.length)];
		String ln = lastNames[new Random().nextInt(lastNames.length)];
		return new Name(fn, ln);
	}

	public static Textbook emitTextbook() {
		String[] titles = { "t1", "t2", "t3", "t4" };
		String[] isbns = { "isbn1", "isbn2", "isbn3", "isbn4" };
		String title = titles[new Random().nextInt(titles.length)];
		String isbn = isbns[new Random().nextInt(isbns.length)];
		Name authorName = emitName();
		double price = (new Random().nextDouble()) * 200;
		return new Textbook(title, isbn, authorName, price);
	}

	public static Textbook[] emitTextbooks(int numberOfBooks) {
		Textbook[] arr = new Textbook[numberOfBooks];
		for (int i = 0; i < numberOfBooks; i++) {
			arr[i] = emitTextbook();
		}
		return arr;
	}

	public static void fillBookStore(int numberOfBooks) {
		bookStore = emitTextbooks(numberOfBooks);
	}

	public static Student emitStudent() {
		String[] firstNames = { "f1", "f2", "f3", "f4" };
		String[] lastNames = { "l1", "l2", "l3", "l4" };
		String[] majors = { "CSE", "MAT", "CST", "ENG", "ENS", "SOC" };
		double gpa = (new Random().nextDouble()) * 4;
		String fn = firstNames[new Random().nextInt(firstNames.length)];
		String ln = lastNames[new Random().nextInt(lastNames.length)];
		String major = majors[new Random().nextInt(majors.length)];
		return new Student(new Name(fn, ln), gpa, major);
	}

	public static Student[] emitStudents(int numberOfStudentsToEmit) {
		Student[] arr = new Student[numberOfStudentsToEmit];
		for (int i = 0; i < numberOfStudentsToEmit; i++) {
			arr[i] = emitStudent();
		}
		return arr;
	}
}
