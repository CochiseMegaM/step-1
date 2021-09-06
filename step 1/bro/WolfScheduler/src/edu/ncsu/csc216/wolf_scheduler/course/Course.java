package edu.ncsu.csc216.wolf_scheduler.course;

public class Course {

	/** Course's name. */
	private String name;
	/** Course's title. */
	private String title;
	/** Course's section. */
	private String section;
	/** Course's credit hours */
	private int credits;
	/** Course's instructor */
	private String instructorId;
	/** Course's meeting days */
	private String meetingDays;
	/** Course's starting time */
	private int startTime;
	/** Course's ending time */
	private int endTime;
	private static final int MIN_NAME_LENGTH = 5;
	private static final int MAX_NAME_LENGTH = 8;
	private static final int MIN_lETTER_COUNT = 1;
	private static final int MAX_LETTER_COUNT = 4;
	private static final int SECTION_LENGTH = 3;
	private static final int MAX_CREDITS = 5;
	private static final int MIN_CREDITS = 1;
	private static final int UPPER_HOUR = 24;
	private static final int UPPER_MINUTE = 60;
	private static final int DIGIT_COUNT = 3;

	/**
	 * Returns the Course's name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set's the Course's name.
	 * @param name Puts the Course name to set
	 */
	private void setName(String name) {
	    int length = name.length();
	    
	    if (name == null) {
	    	throw new IllegalArgumentException("Invalid course name.");
	    	}
	    if (name.length() == 0) {
	    	throw new IllegalArgumentException("Invalid course name.");
	    }
	    if (length < MIN_NAME_LENGTH || length > MAX_NAME_LENGTH )	
	    { throw new IllegalArgumentException("Invalid course name.");
	    }
	    int numberCount = 0;
	    int letterCount = 0;
	    boolean spacefound= false;
	    
	    for  (int i = 0; i <length; i++ ) { if 
	    	(!spacefound ) { if 
	    	(Character.isLetter(name.charAt(i))) {
	    	numberCount++;
	    	}
	    	else if (name.charAt(i) == ' ' ) { spacefound = true;
	    	} else { 
	    		 throw new IllegalArgumentException("Invalid course name.");
	    	} 
	    	}else if  (spacefound) { 
	    	if (Character.isDigit(name.charAt(i))) { letterCount++;
	    	} else { 
	    		 throw new IllegalArgumentException("Invalid course name.");
	    	}	
	    }
	    
	    if (letterCount < MIN_lETTER_COUNT || letterCount >  MAX_LETTER_COUNT)
	    {	 throw new IllegalArgumentException("Invalid course name.");
	}
	if (numberCount != DIGIT_COUNT) {
		 throw new IllegalArgumentException("Invalid course name.");
	}
	    
	    this.name = name;
	 
	}}
	/**
	 * Returns the Titles's name.
	 * 
	 * @return the Title's name
	 */
	public String getTitle() {
		return title;
	}
	
	

	/**
	 * Set's the Title.
	 * 
	 * @param title puts the title to set
	 */
	public void setTitle(String title) {
		if (title == null || title.length() == 0 ) {
			 throw new IllegalArgumentException("Invalid course name.");
		}
	
		this.title = title;
	}

	/**
	 * Returns the Section name .
	 * 
	 * @return the Section name
	 */
	public String getSection() {
		return section;
	}

	/**
	 * Set's the Section.
	 * 
	 * @param section puts the section to set
	 */
	public void setSection(String section) {
		this.section = section;
		
		if (section == null) {
			 throw new IllegalArgumentException("Invalid section.");
		}
		if (section.length() == SECTION_LENGTH) {
			for (int i = 0; i < section.length(); i++)
			{ if  (Character.isLetter(section.charAt(i))) {
				throw new  IllegalArgumentException("Invalid section.");
			}
		}
	} else {
		throw new IllegalArgumentException("Invalid section.");
	}
	}

	/**
	 * Returns the Credits.
	 * 
	 * @return the Credits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * Set's the Credits.
	 * 
	 * @param credits puts the credits to set
	 */
	public void setCredits(int credits) {
		try {
			this.credits = credits;
		} catch (Exception e) { 
			throw new IllegalArgumentException("invalid credits.");
		}
		
		if (credits < MIN_CREDITS || credits > MAX_CREDITS) {
			throw new IllegalArgumentException("invalid credits.");
		}
		this.credits = credits;
	}

	/**
	 * Returns the InstructorId.
	 * 
	 * @return the InstructorId
	 */
	public String getInstructorId() {
		return instructorId;
	}

	/**
	 * Set's the InstructorId.
	 * 
	 * @param instructorId puts the instructor's id set
	 */
	public void setInstructorId(String instructorId) {
		
		
		if (instructorId == null || instructorId.length() == 0) {
			throw new IllegalArgumentException("invalid instructor id .");
		}
		
		
		
		this.instructorId = instructorId;
	}

	/**
	 * Returns the MeetingDays.
	 * 
	 * @return the Meeting Days
	 */
	public String getMeetingDays() {
		return meetingDays;
	}

	/**
	 * Set's the MeetingDays.
	 * 
	 * @param meetingDays puts the meetingDays to set
	 */
	public void setMeetingDaysandTime(String meetingDays, int startTime, int endTime)
	{
		
		if (meetingDays == null || meetingDays.length() == 0 )
		{ throw new IllegalArgumentException("invalid instructor id .");
		}
		
		String a = "A";
		if (meetingDays.equals(a)) { 
			if (startTime != 0 || endTime != 0 ) { 
				throw new IllegalArgumentException("invalid instructor id .");
			}
			
			this.meetingDays = meetingDays;
			this.startTime = 0;
			this.endTime = 0;
			
		} else {  
			int m = 0;
			int t = 0;
			int w = 0;
			int h = 0;
			int f = 0;
		
		for (int i = 0; i < meetingDays.length(); i++) {
		if (meetingDays.charAt(i) == 'M' ) { 
				m++;
			}	
			 else if (meetingDays.charAt(i) == 'T' ) {
				t++;
			} else if (meetingDays.charAt(i) == 'W' ) {
				w++;
			} else if (meetingDays.charAt(i) == 'H' ) {
				h++;
	    	} else if (meetingDays.charAt(i) == 'F' ) {
				f++; 
				}  else  {
	    	 
	throw new IllegalArgumentException("invalid meeting days and times.");
		}
		}
	    	
	   	
		if (m > 1 || t > 1 || w > 1 || h > 1 || f > 1) {
			throw new IllegalArgumentException("invalid meeting days and times. .");
		}
		if (endTime < startTime) {
			throw new IllegalArgumentException("invalid meeting days and times.");
		}
		
		int sHour = (startTime % 100);
		int sMin = (startTime % 100);
		int eHour = (endTime % 100);
		int eMin = (endTime % 100);
		
		if (sHour < 0 || sHour >= UPPER_HOUR) {
			throw new IllegalArgumentException("invalid meeting days and times.");
		}
		if (sMin < 0 || sMin >= UPPER_MINUTE) {
			throw new IllegalArgumentException("invalid meeting days and times.");
		}
		if (eHour < 0 || eHour >= UPPER_HOUR) {
			throw new IllegalArgumentException("invalid meeting days and times.");
		}
		if (eMin < 0 || eMin >= UPPER_MINUTE) {
			throw new IllegalArgumentException("invalid meeting days and times.");
		}
			
	this.meetingDays = meetingDays;
	this.startTime = startTime;
	this.endTime = endTime;
	}

		
		}
	

	/**
	 * Returns the StartTime.
	 * 
	 * @return the Start time
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * Set's the StartTime.
	 * 
	 * @param startTime startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	/**
	 * Returns the EndTime.
	 * 
	 * @return the EndTime
	 */
	public int getEndTime() {
		return endTime;
	}

	/**
	 * Set's the EndTime.
	 * 
	 * @param endTime put the Endtime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	/**
	 * Generates hashCode for Course using all fields.
	 * 
	 * @return hashCode for Course
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credits;
		result = prime * result + endTime;
		result = prime * result + ((instructorId == null) ? 0 : instructorId.hashCode());
		result = prime * result + ((meetingDays == null) ? 0 : meetingDays.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + startTime;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/**
	 * Compares a given object to this object for equality on all fields.
	 * 
	 * @param obj the object to compare
	 * @return true if the objects are all on the same fields.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (credits != other.credits)
			return false;
		if (endTime != other.endTime)
			return false;
		if (instructorId == null) {
			if (other.instructorId != null)
				return false;
		} else if (!instructorId.equals(other.instructorId))
			return false;
		if (meetingDays == null) {
			if (other.meetingDays != null)
				return false;
		} else if (!meetingDays.equals(other.meetingDays))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (startTime != other.startTime)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/**
	 * Returns a comma separated value String of all Course fields.
	 * 
	 * @return String representation of Course
	 */
	@Override
	public String toString() {
		return "Course [name=" + name + ", title=" + title + ", section=" + section + ", credits=" + credits
				+ ", instructorId=" + instructorId + ", meetingDays=" + meetingDays + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}

	/**
	 * @param name         name of the course
	 * @param title        title of the course
	 * @param section      section of Course
	 * @param credits      credit hours for the Course
	 * @param instructorId instructor's unity id
	 * @param meetingDays  meeting days for Course as a series of chars
	 * @param startTime    startTime start Time for Course
	 * @param endTime      end time for Course
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays,
			int startTime, int endTime) {
		this.name = name;
		this.title = title;
		this.section = section;
		this.credits = credits;
		this.instructorId = instructorId;
		this.meetingDays = meetingDays;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Course(String name2, String title2, String section2, int credits2, String instructorId2, String string) {
		// TODO Auto-generated constructor stub
	}

}
