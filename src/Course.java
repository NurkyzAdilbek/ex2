import java.time.LocalDate;



    public class Course {
        private Long id;
        private String name;
        private String description;
        private LocalDate duration;
        private StudyFormat studyFormat;

        public Course(Long id, String name, LocalDate duration, StudyFormat studyFormat) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.duration = duration;
            this.studyFormat = studyFormat;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public LocalDate getDuration() {
            return duration;
        }

        public void setDuration(LocalDate duration) {
            this.duration = duration;
        }

        public StudyFormat getStudyFormat() {
            return studyFormat;
        }

        public void setStudyFormat(StudyFormat studyFormat) {
            this.studyFormat = studyFormat;
        }
    }


