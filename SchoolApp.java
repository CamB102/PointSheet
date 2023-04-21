package cm4Shool;

public class SchoolApp {
	public static void main(String[] args) {

		SchoolYear year2022 = new SchoolYear();
		year2022.year = "2022";

		SchoolYear year2023 = new SchoolYear();
		year2023.year = "2023";

		SchoolYear[] schoolYears = { year2022, year2023 };

		Semester sem1 = new Semester();
		sem1.id = 1;
		sem1.name = "HK1";
		sem1.multiplication = 1;

		Semester sem2 = new Semester();
		sem2.id = 2;
		sem2.name = "HK2";
		sem2.multiplication = 2;

		Semester[] semesters = { sem1, sem2 };

		SemesterDetail sem1year2022 = new SemesterDetail();
		sem1year2022.semester = sem1;
		sem1year2022.schoolyear = year2022;

		SemesterDetail sem2year2022 = new SemesterDetail();
		sem2year2022.semester = sem2;
		sem2year2022.schoolyear = year2022;

		SemesterDetail sem1year2023 = new SemesterDetail();
		sem1year2023.semester = sem1;
		sem1year2023.schoolyear = year2023;

		SemesterDetail sem2year2023 = new SemesterDetail();
		sem1year2023.semester = sem2;
		sem1year2023.schoolyear = year2023;

		SemesterDetail[] semesterDetails = { sem1year2022, sem2year2022, sem1year2023, sem2year2023 };

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Phong 1 khu 1";

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Dung";

		Teacher teacherTri = new Teacher();
		teacherTri.id = 2;
		teacherTri.name = "Tri";
		Teacher[] teachers = { teacherDung, teacherTri };

		Clazz clazz10A1 = new Clazz();
		clazz10A1.id = 1;
		clazz10A1.name = "10A1";
		clazz10A1.locatedRoom = room1;
		clazz10A1.primaryTeacher = teacherTri;

		Clazz clazz10A2 = new Clazz();
		clazz10A2.id = 2;
		clazz10A2.name = "10A2";
		clazz10A2.locatedRoom = room1;
		clazz10A2.primaryTeacher = teacherDung;

		Clazz[] clazzs = { clazz10A1, clazz10A2 };

		Student studentCam = new Student();
		studentCam.id = 2;
		studentCam.name = "Cam";
		studentCam.studyingClazz = clazz10A2;

		Student studentSam = new Student();
		studentSam.id = 3;
		studentSam.name = "Sam";
		studentSam.studyingClazz = clazz10A1;

		Student[] students = new Student[2];
		students[0] = studentCam;
		students[1] = studentSam;

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Toan";
		subjectMath.multiplication = 2;

		Subject subjectHistory = new Subject();
		subjectHistory.id = 2;
		subjectHistory.name = "Lich su";
		subjectHistory.multiplication = 1;

		Subject[] subjects = { subjectMath, subjectHistory };

		TeacherKnowledge dungTeachMath = new TeacherKnowledge();
		dungTeachMath.teacher = teacherDung;
		dungTeachMath.teachingSubject = subjectMath;

		TeacherKnowledge dungTeachHistory = new TeacherKnowledge();
		dungTeachHistory.teacher = teacherDung;
		dungTeachHistory.teachingSubject = subjectMath;

		TeacherKnowledge triTeachHistory = new TeacherKnowledge();
		triTeachHistory.teacher = teacherTri;
		triTeachHistory.teachingSubject = subjectHistory;

		TeacherKnowledge[] teacherknowledges = { dungTeachMath, dungTeachHistory, triTeachHistory };

		Exam examFinalSem1His = new Exam();
		examFinalSem1His.id = 1;
		examFinalSem1His.name = "Final HK1 Mon Su";
		examFinalSem1His.mutiplication = 2;
		examFinalSem1His.subject = subjectHistory;
		examFinalSem1His.semester = sem1;

		Exam examOralSem1Math = new Exam();
		examOralSem1Math.id = 2;
		examOralSem1Math.name = "Mieng HK1 Mon Toan";
		examOralSem1Math.mutiplication = 1;
		examOralSem1Math.subject = subjectMath;
		examOralSem1Math.semester = sem1;

		Exam examFinalSem1Math = new Exam();
		examFinalSem1Math.id = 3;
		examFinalSem1Math.name = "Final HK1 Mon Toan";
		examFinalSem1Math.mutiplication = 3;
		examFinalSem1Math.subject = subjectMath;
		examFinalSem1Math.semester = sem1;

		Exam examFinalSem2His = new Exam();
		examFinalSem2His.id = 2;
		examFinalSem2His.name = "Final HK2 Mon Su";
		examFinalSem2His.mutiplication = 2;
		examFinalSem2His.subject = subjectHistory;
		examFinalSem2His.semester = sem2;

		Exam examOralSem2Math = new Exam();
		examOralSem2Math.id = 1;
		examOralSem2Math.name = "Mieng HK2 Mon Toan";
		examOralSem2Math.mutiplication = 1;
		examOralSem2Math.subject = subjectMath;
		examOralSem2Math.semester = sem2;

		Exam examFinalSem2Math = new Exam();
		examFinalSem2Math.id = 3;
		examFinalSem2Math.name = "Final HK2 Mon Toan";
		examFinalSem2Math.mutiplication = 3;
		examFinalSem2Math.subject = subjectMath;
		examFinalSem2Math.semester = sem2;

		Exam[] exams = { examFinalSem1His, examOralSem1Math, examFinalSem1Math, examFinalSem2His, examOralSem2Math,
				examFinalSem2Math };

		Point point1 = new Point();
		point1.student = studentSam;
		point1.value = 3.75;
		point1.exam = examFinalSem1His;

		Point point2 = new Point();
		point2.student = studentSam;
		point2.value = 5.8;
		point2.exam = examFinalSem1Math;

		Point point3 = new Point();
		point3.student = studentSam;
		point3.value = 8.50;
		point3.exam = examOralSem1Math;

		Point point4 = new Point();
		point4.student = studentCam;
		point4.value = 7.75;
		point4.exam = examFinalSem1His;

		Point point5 = new Point();
		point5.student = studentCam;
		point5.value = 5.25;
		point5.exam = examFinalSem1Math;

		Point point6 = new Point();
		point6.student = studentCam;
		point6.value = 10;
		point6.exam = examOralSem1Math;

		Point point7 = new Point();
		point7.student = studentSam;
		point7.value = 6.50;
		point7.exam = examFinalSem2His;

		Point point8 = new Point();
		point8.student = studentSam;
		point8.value = 7;
		point8.exam = examFinalSem2Math;

		Point point9 = new Point();
		point9.student = studentSam;
		point9.value = 9.75;
		point9.exam = examOralSem2Math;

		Point point10 = new Point();
		point10.student = studentCam;
		point10.value = 9.25;
		point10.exam = examFinalSem2His;

		Point point11 = new Point();
		point11.student = studentCam;
		point11.value = 8.7;
		point11.exam = examFinalSem2Math;

		Point point12 = new Point();
		point12.student = studentCam;
		point12.value = 10;
		point12.exam = examOralSem2Math;

		Point[] points = { point1, point2, point3, point4, point5, point6, point7, point8, point9, point10, point11,
				point12 };

		for (Student student : students) {
			System.out.println("---> Student: " + student.name + " <---");
			System.out.println(
					"Class: " + student.studyingClazz.name + " - Location: " + student.studyingClazz.locatedRoom.name);
			System.out.println("Primary teacher: " + student.studyingClazz.primaryTeacher.name);
			System.out.println("\n");
			for (SchoolYear schoolYear : schoolYears) {
				double totalAverageAllSemester = 0;
				double averagePointASchoolYear = 0;
				int totalSemesterMutiplication = 0;

				for (Semester semester : semesters) {
					int totalSubjectMutiplication = 0;
					double totalAverageAllSubject = 0;
					double averagePointWholeSemester = 0;

					for (SemesterDetail semesterDetail : semesterDetails) {
						
						if (semesterDetail.schoolyear == schoolYear && semesterDetail.semester == semester) {
							System.out.println("~ " + semester.name + " " + semesterDetail.schoolyear.year + " ~");

							for (Subject subject : subjects) {
								double totalPointAfterMultiplication = 0;
								int totalMultiplication = 0;
								double averagePointPerSubject = 0;

								System.out.println("-");
								System.out.println("Subject: " + subject.name);

								for (Exam exam : exams) {
									if (exam.semester == semester & exam.subject == subject) {
										System.out.println("Exam: " + exam.name);

										totalMultiplication += exam.mutiplication;

										for (Point point : points) {

											if (point.student == student && point.exam == exam) {

												System.out.println("Point: " + point.value);
												totalPointAfterMultiplication += (point.value
														* point.exam.mutiplication);

											}

										}

									}

								}
								// diem trung binh tung mon
								averagePointPerSubject = totalPointAfterMultiplication / totalMultiplication;

								System.out.println("=> TRUNG BINH MON " + subject.name + " :"
										+ String.format("%.2f", averagePointPerSubject));
								System.out.println("\n");

								totalSubjectMutiplication += subject.multiplication;
								totalAverageAllSubject += averagePointPerSubject * subject.multiplication;

							}
							// diem trung binh tung hoc ki
							averagePointWholeSemester = totalAverageAllSubject / totalSubjectMutiplication;
							System.out.println("==> DIEM CUOI KI " + semester.name + " :"
									+ String.format("%.2f", averagePointWholeSemester));
							System.out.println("\n");

							totalSemesterMutiplication += semester.multiplication;
							totalAverageAllSemester += averagePointWholeSemester * semester.multiplication;

						}

					}

				}
				// diem trung binh tung nam
				averagePointASchoolYear = totalAverageAllSemester / totalSemesterMutiplication;
				System.out.println("===> DIEM CUOI NAM " + schoolYear.year + " :"
						+ String.format("%.2f", averagePointASchoolYear));
				System.out.println("\n\n\n");

			}
		}
	}
}
