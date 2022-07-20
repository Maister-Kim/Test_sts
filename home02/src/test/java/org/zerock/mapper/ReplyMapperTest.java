package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTest {
	
	//테스트 전 게시물 존재여부 확인
	private Long[] bnoArr = { 8l, 9l, 11l, 12l, 21l }; 
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
/*	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			//게시물 번호
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("댓글테스트 "+i);
			vo.setReplyer("replyer"+i);
			
			mapper.insert(vo);
		});
	}*/
	
	@Test
	public void testCreate() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			//게시물 번호
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("Test reply");
			vo.setReplyer("Test replyer");
			
			mapper.insert(vo);
		});
	}
	
	
	
/*	@Test
	public void testMapper() {
		log.info(mapper);
	}*/
	
/*	@Test
	public void testRead() {
		Long targetRno = 6l;
		
		ReplyVO vo = mapper.read(targetRno);
		
		log.info(vo);
	}*/

/*	@Test
	public void testDelete() {
		Long targetRno = 5l;
		
		mapper.delete(targetRno);
		
	}*/
	
/*	@Test
	public void testUpdate() {
		Long targetRno = 9l;
		
		ReplyVO vo = mapper.read(targetRno);
		
		vo.setReply("Update Reply ");
		
		int count = mapper.update(vo);
		
		log.info("UPDATE COUNT: " + count);
	}*/
	
/*	@Test
	public void testList()
	{
		Criteria cri = new Criteria();
		
		//254l
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
		
		replies.forEach(reply -> log.info(reply));
	}*/
	
	
}
