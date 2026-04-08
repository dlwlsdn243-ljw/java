package day18;

// enum 문서 상태
enum DocumentStatus{
	DRAFT{

		@Override
		public String getMessage() {
			return "문서가 초안 상태입니다. 수정이 가능합니다.";
		}
		
	}, IN_REVIEW{
		
		@Override
		public String getMessage() {
			return "문서가 검토 중입니다. 수정이 불가합니다.";
		}
		
	}, APPROVED{
		
		@Override
		public String getMessage() {
			return "문서가 승인 되었습니다.";
		}
		
	}, REJECTED{
		
		@Override
		public String getMessage() {
			return "문서가 반려 되었습니다. 다시 작성해주세요.";
		}
		
	};
	
	public abstract String getMessage(); // 추상 메서드
	// 맴버변수가 있으면 생성자 필수!!
	
	
}

class Doucument{
	private String title;
	private DocumentStatus status;
	
	public Doucument(String title, DocumentStatus documentStatus) {
		this.title = title;
		this.status = documentStatus;
	}
	
	// 출력 메서드
	public void printStatus() {
		System.out.println("["+title+"] 상태 : "+ status);
		System.out.println(" -> " + status.getMessage());
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public DocumentStatus getStatus() {
		return status;
	}

	public void setStatus(DocumentStatus status) {
		this.status = status;
	}	
}
