package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;


import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestList {

  private List<Integer> list;
  private LinkedList<Integer> Llist;

  @Before
  public void setUp() throws Exception {
    list = new ArrayList<Integer>();
    // TODO also try with a LinkedList - does it make any difference?
    Llist = new LinkedList<Integer>();
  }

  @After
  public void tearDown() throws Exception {
    list = null;
    Llist = null;
  }

  @Test
  public void testSizeEmpty() {
    assertTrue(list.isEmpty());
    assertEquals(0, list.size());
    try {
      list.get(0);
      fail("there should not be any items in the list");
    } catch (Exception ex) {
    }
  }

  @Test
  public void testSizeNonEmpty() {
    // TODO fix the expected values in the assertions below
    //list.add(77);
    assertEquals(true, list.isEmpty());
    assertEquals(0, list.size());
    list.add(0);
    assertEquals(0, list.get(0).intValue());
  }
  @Test
  public void testLinkedSizeNonEmpty() {
    // TODO fix the expected values in the assertions below
    //list.add(77);
    assertEquals(true, Llist.isEmpty());
    assertEquals(0, Llist.size());
    Llist.add(0);
    assertEquals(0, Llist.get(0).intValue());
  }

  @Test
  public void testContains() {
    // TODO write assertions using
    assertFalse(list.contains(77));
    list.add(77);
    assertTrue(list.contains(77));

    // list.contains(77)
    // that hold before and after adding 77 to the list
  }

  @Test
  public void testLinkedContains() {
    // TODO write assertions using
    assertFalse(Llist.contains(77));
    Llist.add(77);
    assertTrue(Llist.contains(77));

    // list.contains(77)
    // that hold before and after adding 77 to the list
  }

  @Test
  public void testAddMultiple() {
    list.add(77);
    list.add(77);
    list.add(77);
    // TODO fix the expected values in the assertions below
    assertEquals(3, list.size());
    assertEquals(0, list.indexOf(77));
    assertEquals(77, list.get(1).intValue());
    assertEquals(2, list.lastIndexOf(77));
  }

  @Test
  public void testLinkedAddMultiple() {
    Llist.add(77);
    Llist.add(77);
    Llist.add(77);
    // TODO fix the expected values in the assertions below
    assertEquals(3, Llist.size());
    assertEquals(0, Llist.indexOf(77));
    assertEquals(77, Llist.get(1).intValue());
    assertEquals(2, Llist.lastIndexOf(77));
  }

  @Test
  public void testAddMultiple2() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    // TODO fix the expected values in the assertions below
    assertEquals(7, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(5, list.lastIndexOf(77));
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    assertEquals(Arrays.asList(33, 77, 44,77,55,77,66), list);
  }

  @Test
  public void testLinkedAddMultiple2() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);
    // TODO fix the expected values in the assertions below
    assertEquals(7, Llist.size());
    assertEquals(1, Llist.indexOf(77));
    assertEquals(5, Llist.lastIndexOf(77));
    assertEquals(44, Llist.get(2).intValue());
    assertEquals(77, Llist.get(3).intValue());
    assertEquals(Arrays.asList(33, 77, 44,77,55,77,66), Llist);
  }


  @Test
  public void testRemoveObject() {
    list.add(3);
    list.add(77);
    list.add(4);
    list.add(77);
    list.add(5);
    list.add(77);
    list.add(6);
    list.remove(5); // what does this method do?
    // TODO fix the expected values in the assertions below
    assertEquals(6, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(3, list.lastIndexOf(77));
    assertEquals(4, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    list.remove(Integer.valueOf(5)); // what does this one do?
    assertEquals(5, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(3, list.lastIndexOf(77));
    assertEquals(4, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
  }

  @Test
  public void testLinkedRemoveObject() {
    Llist.add(3);
    Llist.add(77);
    Llist.add(4);
    Llist.add(77);
    Llist.add(5);
    Llist.add(77);
    Llist.add(6);
    Llist.remove(5); // what does this method do?
    // TODO fix the expected values in the assertions below
    assertEquals(6, Llist.size());
    assertEquals(1, Llist.indexOf(77));
    assertEquals(3, Llist.lastIndexOf(77));
    assertEquals(4, Llist.get(2).intValue());
    assertEquals(77, Llist.get(3).intValue());
    Llist.remove(Integer.valueOf(5)); // what does this one do?
    assertEquals(5, Llist.size());
    assertEquals(1, Llist.indexOf(77));
    assertEquals(3, Llist.lastIndexOf(77));
    assertEquals(4, Llist.get(2).intValue());
    assertEquals(77, Llist.get(3).intValue());
  }

  @Test
  public void testContainsAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);

    // TODO using containsAll and Arrays.asList (see above),
    // 1) assert that list contains all five different numbers added
    // 2) assert that list does not contain all of 11, 22, and 33
    assertEquals(7, list.size());
    assertEquals(1, list.indexOf(77));
    assertEquals(5, list.lastIndexOf(77));
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    list.remove(Integer.valueOf(33)); // what does this one do?
    assertEquals(6, list.size());
    assertEquals(0, list.indexOf(77));
    assertEquals(4, list.lastIndexOf(77));
    assertEquals(77, list.get(2).intValue());
    assertEquals(55, list.get(3).intValue());

  }

  @Test
  public void testLinkedContainsAll() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);

    // TODO using containsAll and Arrays.asList (see above),
    // 1) assert that list contains all five different numbers added
    // 2) assert that list does not contain all of 11, 22, and 33
    assertEquals(7, Llist.size());
    assertEquals(1, Llist.indexOf(77));
    assertEquals(5, Llist.lastIndexOf(77));
    assertEquals(44, Llist.get(2).intValue());
    assertEquals(77, Llist.get(3).intValue());
    Llist.remove(Integer.valueOf(33)); // what does this one do?
    assertEquals(6, Llist.size());
    assertEquals(0, Llist.indexOf(77));
    assertEquals(4, Llist.lastIndexOf(77));
    assertEquals(77, Llist.get(2).intValue());
    assertEquals(55, Llist.get(3).intValue());

  }

  @Test
  public void testAddAll() {

    list.addAll(Arrays.asList(33,77,44,77,55,77,66));
    // TODO in a single statement using addAll and Arrays.asList,
    // add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, list.size());
    assertEquals(33, list.get(0).intValue());
    assertEquals(77, list.get(1).intValue());
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    assertEquals(55, list.get(4).intValue());
    assertEquals(77, list.get(5).intValue());
    assertEquals(66, list.get(6).intValue());
    assertEquals(Arrays.asList(33,77,44,77,55,77,66), list);
  }
  @Test
  public void testLinkedAddAll() {

    Llist.addAll(Arrays.asList(33,77,44,77,55,77,66));
    // TODO in a single statement using addAll and Arrays.asList,
    // add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, Llist.size());
    assertEquals(33, Llist.get(0).intValue());
    assertEquals(77, Llist.get(1).intValue());
    assertEquals(44, Llist.get(2).intValue());
    assertEquals(77, Llist.get(3).intValue());
    assertEquals(55, Llist.get(4).intValue());
    assertEquals(77, Llist.get(5).intValue());
    assertEquals(66, Llist.get(6).intValue());
    assertEquals(Arrays.asList(33,77,44,77,55,77,66), Llist);
  }
  @Test
  public void testLinkedRemoveAll() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);
    Llist.removeAll(Arrays.asList(33,44,55,66));
    // TODO in a single statement using removeAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, Llist.size());
    assertEquals(Arrays.asList(77, 77, 77), Llist);
  }

  @Test
  public void testRemoveAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    list.removeAll(Arrays.asList(33,44,55,66));
    // TODO in a single statement using removeAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, list.size());
    assertEquals(Arrays.asList(77, 77, 77), list);
  }

  @Test
  public void testRetainAll() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    list.retainAll(Arrays.asList(77,77,77));
    // TODO in a single statement using retainAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, list.size());
    assertEquals(Arrays.asList(77, 77, 77), list);
  }

  @Test
  public void testLinkedRetainAll() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);
    Llist.retainAll(Arrays.asList(77,77,77));
    // TODO in a single statement using retainAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, Llist.size());
    assertEquals(Arrays.asList(77, 77, 77), Llist);
  }

  @Test
  public void testSet() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    list.set(1,99);
    list.set(3,99);
    list.set(5,99);
    // TODO use the set method to change specific elements in the list
    // such that the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, list.size());
    assertEquals(33, list.get(0).intValue());
    assertEquals(99, list.get(1).intValue());
    assertEquals(44, list.get(2).intValue());
    assertEquals(99, list.get(3).intValue());
    assertEquals(55, list.get(4).intValue());
    assertEquals(99, list.get(5).intValue());
    assertEquals(66, list.get(6).intValue());
  }
  @Test
  public void testLinkedSet() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);
    Llist.set(1,99);
    Llist.set(3,99);
    Llist.set(5,99);
    // TODO use the set method to change specific elements in the list
    // such that the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, Llist.size());
    assertEquals(33, Llist.get(0).intValue());
    assertEquals(99, Llist.get(1).intValue());
    assertEquals(44, Llist.get(2).intValue());
    assertEquals(99, Llist.get(3).intValue());
    assertEquals(55, Llist.get(4).intValue());
    assertEquals(99, Llist.get(5).intValue());
    assertEquals(66, Llist.get(6).intValue());
  }

  @Test
  public void testSubList() {
    list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    // TODO fix the arguments in the subList method so that the assertion
    // passes
    assertEquals(Arrays.asList(33,77,44, 77, 55,77,66), list.subList(0, list.size()));
  }

  @Test
  public void testLinkedSubList() {
    Llist.add(33);
    Llist.add(77);
    Llist.add(44);
    Llist.add(77);
    Llist.add(55);
    Llist.add(77);
    Llist.add(66);
    // TODO fix the arguments in the subList method so that the assertion
    // passes
    assertEquals(Arrays.asList(33,77,44, 77, 55,77,66), Llist.subList(0, Llist.size()));
  }
}
