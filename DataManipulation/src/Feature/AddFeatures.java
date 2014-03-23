package Feature;

import java.util.ArrayList;
import java.util.List;

public class AddFeatures {
	public List<Feature> AddArrayStringFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("Array_Q_Array", new String[] { "Array" }));
		ret.add(new Feature("Array_Q_ArrayList", new String[] { "ArrayList" }));
		ret.add(new Feature("Array_Q_String", new String[] { "String" }));
		ret.add(new Feature("Array_Q_StringBuffer", new String[] { "StringBuffer" }));
		ret.add(new Feature("Array_Q_Add", new String[] { "Add" }));
		ret.add(new Feature("Array_Q_IndexOf", new String[] { "IndexOf" }));
		ret.add(new Feature("Array_Q_Last", new String[] { "Last" }));
		ret.add(new Feature("Array_Q_First", new String[] { "First" }));
		ret.add(new Feature("Array_Q_Remove", new String[] { "Remove" }));
		ret.add(new Feature("Array_Q_All", new String[] { "Array", "ArrayList", "String",
				"StringBuffer", "Add", "IndexOf", "Last", "First" }));
		// maybe some more
		ret.add(new Feature(true, "Array_QA_Array", new String[] { "Array" }));
		ret.add(new Feature(true, "Array_QA_ArrayList", new String[] { "ArrayList" }));
		ret.add(new Feature(true, "Array_QA_String", new String[] { "String" }));
		ret.add(new Feature(true, "Array_QA_StringBuffer", new String[] { "StringBuffer" }));
		ret.add(new Feature(true, "Array_QA_Add", new String[] { "Add" }));
		ret.add(new Feature(true, "Array_QA_IndexOf", new String[] { "IndexOf" }));
		ret.add(new Feature(true, "Array_QA_Last", new String[] { "Last" }));
		ret.add(new Feature(true, "Array_QA_First", new String[] { "First" }));
		ret.add(new Feature(true, "Array_QA_Remove", new String[] { "Remove" }));
		ret.add(new Feature(true, "Array_QA_All", new String[] { "Array", "ArrayList", "String",
				"StringBuffer", "Add", "IndexOf", "Last", "First" }));
		return ret;
	}
	
	public List<Feature> AddLinkedListFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
	
		ret.add(new Feature("LinkedList_Q_[", new String[] { "[" }));
		ret.add(new Feature("LinkedList_Q_]", new String[] { "]" }));
		ret.add(new Feature("LinkedList_Q_.", new String[] { "." }));
		ret.add(new Feature("LinkedList_Q_->", new String[] { "->" }));
		ret.add(new Feature("LinkedList_Q_next", new String[] { "next" }));
		ret.add(new Feature("LinkedList_Q_prev", new String[] { "prev" }));
		ret.add(new Feature("LinkedList_Q_linked", new String[] { "linked" }));
		ret.add(new Feature("LinkedList_Q_list", new String[] { "list" }));
		ret.add(new Feature("LinkedList_Q_node", new String[] { "node" }));
		ret.add(new Feature("LinkedList_Q_head", new String[] { "head" }));
		ret.add(new Feature("LinkedList_Q_rear", new String[] { "rear" }));
		ret.add(new Feature("LinkedList_Q_tail", new String[] { "tail" }));
		ret.add(new Feature("LinkedList_Q_single", new String[] { "single" }));
		ret.add(new Feature("LinkedList_Q_double", new String[] { "double" }));
		ret.add(new Feature("LinkedList_Q_loop", new String[] { "loop" }));
		ret.add(new Feature("LinkedList_Q_circular", new String[] { "circular" }));
		ret.add(new Feature("LinkedList_Q_acycle", new String[] { "acycle" }));
		ret.add(new Feature("LinkedList_Q_nodes", new String[] { "nodes" }));
		ret.add(new Feature("LinkedList_Q_end", new String[] { "end" }));
		ret.add(new Feature("LinkedList_Q_sorted", new String[] { "sorted" }));
		ret.add(new Feature("LinkedList_Q_unsorted", new String[] { "unsorted" }));
		ret.add(new Feature("LinkedList_Q_element", new String[] { "element" }));
		ret.add(new Feature("LinkedList_Q_first", new String[] { "first" }));
		ret.add(new Feature("LinkedList_Q_last", new String[] { "last" }));
		ret.add(new Feature("LinkedList_Q_reverse", new String[] { "reverse" }));
		ret.add(new Feature("LinkedList_Q_All", new String[] {  "[", "]", ".", "->", "next", "prev", "linked", "list", "node", "head", "rear", "tail", "single", "double", "loop", "circular", "acycle", "nodes", "end", "sorted", "unsorted", "element", "first", "last", "reverse"  }));
		
		ret.add(new Feature(true,"LinkedList_QA_[", new String[] { "[" }));
		ret.add(new Feature(true,"LinkedList_QA_]", new String[] { "]" }));
		ret.add(new Feature(true,"LinkedList_QA_.", new String[] { "." }));
		ret.add(new Feature(true,"LinkedList_QA_->", new String[] { "->" }));
		ret.add(new Feature(true,"LinkedList_QA_next", new String[] { "next" }));
		ret.add(new Feature(true,"LinkedList_QA_prev", new String[] { "prev" }));
		ret.add(new Feature(true,"LinkedList_QA_linked", new String[] { "linked" }));
		ret.add(new Feature(true,"LinkedList_QA_list", new String[] { "list" }));
		ret.add(new Feature(true,"LinkedList_QA_node", new String[] { "node" }));
		ret.add(new Feature(true,"LinkedList_QA_head", new String[] { "head" }));
		ret.add(new Feature(true,"LinkedList_QA_rear", new String[] { "rear" }));
		ret.add(new Feature(true,"LinkedList_QA_tail", new String[] { "tail" }));
		ret.add(new Feature(true,"LinkedList_QA_single", new String[] { "single" }));
		ret.add(new Feature(true,"LinkedList_QA_double", new String[] { "double" }));
		ret.add(new Feature(true,"LinkedList_QA_loop", new String[] { "loop" }));
		ret.add(new Feature(true,"LinkedList_QA_circular", new String[] { "circular" }));
		ret.add(new Feature(true,"LinkedList_QA_acycle", new String[] { "acycle" }));
		ret.add(new Feature(true,"LinkedList_QA_nodes", new String[] { "nodes" }));
		ret.add(new Feature(true,"LinkedList_QA_end", new String[] { "end" }));
		ret.add(new Feature(true,"LinkedList_QA_sorted", new String[] { "sorted" }));
		ret.add(new Feature(true,"LinkedList_QA_unsorted", new String[] { "unsorted" }));
		ret.add(new Feature(true,"LinkedList_QA_element", new String[] { "element" }));
		ret.add(new Feature(true,"LinkedList_QA_first", new String[] { "first" }));
		ret.add(new Feature(true,"LinkedList_QA_last", new String[] { "last" }));
		ret.add(new Feature(true,"LinkedList_QA_reverse", new String[] { "reverse" }));
		ret.add(new Feature(true,"LinkedList_QA_All", new String[] {  "[", "]", ".", "->", "next", "prev", "linked", "list", "node", "head", "rear", "tail", "single", "double", "loop", "circular", "acycle", "nodes", "end", "sorted", "unsorted", "element", "first", "last", "reverse"  }));
	
		return ret;
	}
	
	
	public List<Feature> AddTreeGraphFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("TreeGraph_Q_tree", new String[] { "tree" }));
		ret.add(new Feature("TreeGraph_Q_node", new String[] { "node" }));
		ret.add(new Feature("TreeGraph_Q_AVL", new String[] { "AVL" }));
		ret.add(new Feature("TreeGraph_Q_balance", new String[] { "balance" }));
		ret.add(new Feature("TreeGraph_Q_binary", new String[] { "binary" }));
		ret.add(new Feature("TreeGraph_Q_search", new String[] { "search" }));
		ret.add(new Feature("TreeGraph_Q_traversal", new String[] { "traversal" }));
		ret.add(new Feature("TreeGraph_Q_inorder", new String[] { "inorder" }));
		ret.add(new Feature("TreeGraph_Q_in-order", new String[] { "in-order" }));
		ret.add(new Feature("TreeGraph_Q_pre-order", new String[] { "pre-order" }));
		ret.add(new Feature("TreeGraph_Q_preorder", new String[] { "preorder" }));
		ret.add(new Feature("TreeGraph_Q_postorder", new String[] { "postorder" }));
		ret.add(new Feature("TreeGraph_Q_post-order", new String[] { "post-order" }));
		ret.add(new Feature("TreeGraph_Q_traverse", new String[] { "traverse" }));
		ret.add(new Feature("TreeGraph_Q_root", new String[] { "root" }));
		ret.add(new Feature("TreeGraph_Q_leaves", new String[] { "leaves" }));
		ret.add(new Feature("TreeGraph_Q_leaf", new String[] { "leaf" }));
		ret.add(new Feature("TreeGraph_Q_child", new String[] { "child" }));
		ret.add(new Feature("TreeGraph_Q_children", new String[] { "children" }));
		ret.add(new Feature("TreeGraph_Q_left", new String[] { "left" }));
		ret.add(new Feature("TreeGraph_Q_right", new String[] { "right" }));
		ret.add(new Feature("TreeGraph_Q_dfs", new String[] { "dfs" }));
		ret.add(new Feature("TreeGraph_Q_bfs", new String[] { "fbfs" }));
		ret.add(new Feature("TreeGraph_Q_depth", new String[] { "depth" }));
		ret.add(new Feature("TreeGraph_Q_level", new String[] { "level" }));
		ret.add(new Feature("TreeGraph_Q_breadth", new String[] { "breadth" }));
		ret.add(new Feature("TreeGraph_Q_sibling", new String[] { "sibling" }));
		ret.add(new Feature("TreeGraph_Q_degree", new String[] { "degree" }));
		ret.add(new Feature("TreeGraph_Q_directed", new String[] { "directed" }));
		ret.add(new Feature("TreeGraph_Q_route", new String[] { "route" }));
		ret.add(new Feature("TreeGraph_Q_TSP", new String[] { "TSP" }));
		ret.add(new Feature("TreeGraph_Q_undirected", new String[] { "undirected" }));
		ret.add(new Feature("TreeGraph_Q_graph", new String[] { "graph" }));
		ret.add(new Feature("TreeGraph_Q_height", new String[] { "height" }));
		ret.add(new Feature("TreeGraph_Q_successor", new String[] { "successor" }));
		ret.add(new Feature("TreeGraph_Q_parent", new String[] { "parent" }));
		ret.add(new Feature("TreeGraph_Q_ancestor", new String[] { "ancestor" }));
		ret.add(new Feature("TreeGraph_Q_subtree", new String[] { "subtree" }));
		ret.add(new Feature("TreeGraph_Q_path", new String[] { "path" }));
		ret.add(new Feature("TreeGraph_Q_All", new String[] { "undirected", "graph", "tree", "node", "AVL", "balance", "binary", "search", "traversal", "inorder", "in-order", "pre-order", "preorder", "postorder", "post-order", "traverse", "root", "leaves", "leaf", "child", "children", "left", "right", "dfs", "bfs", "depth", "level", "breadth", "sibling", "degree", "directed", "route", "TSP", "height", "successor", "parent", "ancestor", "subtree", "path"  }));
		
        ret.add(new Feature(true,"TreeGraph_QA_tree", new String[] { "tree" }));
		ret.add(new Feature(true,"TreeGraph_QA_node", new String[] { "node" }));
		ret.add(new Feature(true,"TreeGraph_QA_AVL", new String[] { "AVL" }));
		ret.add(new Feature(true,"TreeGraph_QA_balance", new String[] { "balance" }));
		ret.add(new Feature(true,"TreeGraph_QA_binary", new String[] { "binary" }));
		ret.add(new Feature(true,"TreeGraph_QA_search", new String[] { "search" }));
		ret.add(new Feature(true,"TreeGraph_QA_traversal", new String[] { "traversal" }));
		ret.add(new Feature(true,"TreeGraph_QA_inorder", new String[] { "inorder" }));
		ret.add(new Feature(true,"TreeGraph_QA_in-order", new String[] { "in-order" }));
		ret.add(new Feature(true,"TreeGraph_QA_pre-order", new String[] { "pre-order" }));
		ret.add(new Feature(true,"TreeGraph_QA_preorder", new String[] { "preorder" }));
		ret.add(new Feature(true,"TreeGraph_QA_postorder", new String[] { "postorder" }));
		ret.add(new Feature(true,"TreeGraph_QA_post-order", new String[] { "post-order" }));
		ret.add(new Feature(true,"TreeGraph_QA_traverse", new String[] { "traverse" }));
		ret.add(new Feature(true,"TreeGraph_QA_root", new String[] { "root" }));
		ret.add(new Feature(true,"TreeGraph_QA_leaves", new String[] { "leaves" }));
		ret.add(new Feature(true,"TreeGraph_QA_leaf", new String[] { "leaf" }));
		ret.add(new Feature(true,"TreeGraph_QA_child", new String[] { "child" }));
		ret.add(new Feature(true,"TreeGraph_QA_children", new String[] { "children" }));
		ret.add(new Feature(true,"TreeGraph_QA_left", new String[] { "left" }));
		ret.add(new Feature(true,"TreeGraph_QA_right", new String[] { "right" }));
		ret.add(new Feature(true,"TreeGraph_QA_dfs", new String[] { "dfs" }));
		ret.add(new Feature(true,"TreeGraph_QA_bfs", new String[] { "fbfs" }));
		ret.add(new Feature(true,"TreeGraph_QA_depth", new String[] { "depth" }));
		ret.add(new Feature(true,"TreeGraph_QA_level", new String[] { "level" }));
		ret.add(new Feature(true,"TreeGraph_QA_breadth", new String[] { "breadth" }));
		ret.add(new Feature(true,"TreeGraph_QA_sibling", new String[] { "sibling" }));
		ret.add(new Feature(true,"TreeGraph_QA_degree", new String[] { "degree" }));
		ret.add(new Feature(true,"TreeGraph_QA_directed", new String[] { "directed" }));
		ret.add(new Feature(true,"TreeGraph_QA_undirected", new String[] { "undirected" }));
		ret.add(new Feature(true,"TreeGraph_QA_graph", new String[] { "graph" }));
		ret.add(new Feature(true,"TreeGraph_QA_route", new String[] { "route" }));
		ret.add(new Feature(true,"TreeGraph_QA_TSP", new String[] { "TSP" }));
		ret.add(new Feature(true,"TreeGraph_QA_height", new String[] { "height" }));
		ret.add(new Feature(true,"TreeGraph_QA_successor", new String[] { "successor" }));
		ret.add(new Feature(true,"TreeGraph_QA_parent", new String[] { "parent" }));
		ret.add(new Feature(true,"TreeGraph_QA_ancestor", new String[] { "ancestor" }));
		ret.add(new Feature(true,"TreeGraph_QA_subtree", new String[] { "subtree" }));
		ret.add(new Feature(true,"TreeGraph_QA_path", new String[] { "path" }));
		ret.add(new Feature(true,"TreeGraph_QA_All", new String[] { "undirected", "graph", "tree", "node", "AVL", "balance", "binary", "search", "traversal", "inorder", "in-order", "pre-order", "preorder", "postorder", "post-order", "traverse", "root", "leaves", "leaf", "child", "children", "left", "right", "dfs", "bfs", "depth", "level", "breadth", "sibling", "degree", "directed", "route", "TSP", "height", "successor", "parent", "ancestor", "subtree", "path"  }));
		
		return ret;
	}
	
	public List<Feature> AddStackQueueFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("StackQueue_Q_stack", new String[] { "stack" }));
		ret.add(new Feature("StackQueue_Q_top", new String[] { "top" }));
		ret.add(new Feature("StackQueue_Q_push", new String[] { "push" }));
		ret.add(new Feature("StackQueue_Q_pop", new String[] { "pop" }));
		ret.add(new Feature("StackQueue_Q_bottom", new String[] { "bottom" }));
		ret.add(new Feature("StackQueue_Q_queue", new String[] { "queue" }));
		ret.add(new Feature("StackQueue_Q_enqueue", new String[] { "enqueue" }));
		ret.add(new Feature("StackQueue_Q_fifo", new String[] { "fifo" }));
		ret.add(new Feature("StackQueue_Q_filo", new String[] { "filo" }));
		ret.add(new Feature("StackQueue_Q_lifo", new String[] { "lifo" }));
		ret.add(new Feature("StackQueue_Q_dequeue", new String[] { "dequeue" }));
		ret.add(new Feature("StackQueue_Q_priority", new String[] { "priority" }));
		ret.add(new Feature("StackQueue_Q_priorityqueue", new String[] { "priorityqueue" }));
		ret.add(new Feature("StackQueue_Q_front", new String[] { "front" }));
		ret.add(new Feature("StackQueue_Q_back", new String[] { "back" }));
		ret.add(new Feature("StackQueue_Q_capacity", new String[] { "capacity" }));
		ret.add(new Feature("StackQueue_Q_resize", new String[] { "resize" }));
		ret.add(new Feature("StackQueue_Q_peek", new String[] { "peek" }));
		ret.add(new Feature("StackQueue_Q_isempty", new String[] { "isempty" }));
		
		ret.add(new Feature("StackQueue_Q_All", new String[] { "stack", "top", "push", "pop", "bottom", "queue", "enqueue", "fifo", "filo", "lifo", "enqueue", "priority", "priorityqueue", "front", "back", "capacity", "resize", "peek", "isempty"  }));
		
		ret.add(new Feature(true,"StackQueue_QA_stack", new String[] { "stack" }));
		ret.add(new Feature(true,"StackQueue_QA_top", new String[] { "top" }));
		ret.add(new Feature(true,"StackQueue_QA_push", new String[] { "push" }));
		ret.add(new Feature(true,"StackQueue_QA_pop", new String[] { "pop" }));
		ret.add(new Feature(true,"StackQueue_QA_bottom", new String[] { "bottom" }));
		ret.add(new Feature(true,"StackQueue_QA_queue", new String[] { "queue" }));
		ret.add(new Feature(true,"StackQueue_QA_enqueue", new String[] { "enqueue" }));
		ret.add(new Feature(true,"StackQueue_QA_fifo", new String[] { "fifo" }));
		ret.add(new Feature(true,"StackQueue_QA_filo", new String[] { "filo" }));
		ret.add(new Feature(true,"StackQueue_QA_lifo", new String[] { "lifo" }));
		ret.add(new Feature(true,"StackQueue_QA_dequeue", new String[] { "dequeue" }));
		ret.add(new Feature(true,"StackQueue_QA_priority", new String[] { "priority" }));
		ret.add(new Feature(true,"StackQueue_QA_priorityqueue", new String[] { "priorityqueue" }));
		ret.add(new Feature(true,"StackQueue_QA_front", new String[] { "front" }));
		ret.add(new Feature(true,"StackQueue_QA_back", new String[] { "back" }));
		ret.add(new Feature(true,"StackQueue_QA_capacity", new String[] { "capacity" }));
		ret.add(new Feature(true,"StackQueue_QA_resize", new String[] { "resize" }));
		ret.add(new Feature(true,"StackQueue_QA_peek", new String[] { "peek" }));
		ret.add(new Feature(true,"StackQueue_QA_isempty", new String[] { "isempty" }));
		
		ret.add(new Feature(true,"StackQueue_QA_All", new String[] {  "stack", "top", "push", "pop", "bottom", "queue", "enqueue", "fifo", "filo", "lifo", "enqueue", "priority", "priorityqueue", "front", "back", "capacity", "resize", "peek", "isempty"  }));	
		return ret;
	}
	
	public List<Feature> AddBitManiFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("BitMani_Q_arithmetic", new String[] { "arithmetic" }));
		ret.add(new Feature("BitMani_Q_shift", new String[] { "shift" }));
		ret.add(new Feature("BitMani_Q_left", new String[] { "left" }));
		ret.add(new Feature("BitMani_Q_right", new String[] { "right" }));
		ret.add(new Feature("BitMani_Q_digit", new String[] { "digit" }));
		ret.add(new Feature("BitMani_Q_digits", new String[] { "digits" }));
		ret.add(new Feature("BitMani_Q_and", new String[] { "and" }));
		ret.add(new Feature("BitMani_Q_or", new String[] { "or" }));
		ret.add(new Feature("BitMani_Q_xor", new String[] { "xor" }));
		ret.add(new Feature("BitMani_Q_&", new String[] { "&" }));
		ret.add(new Feature("BitMani_Q_|", new String[] { "|" }));
		ret.add(new Feature("BitMani_Q_<<", new String[] { "<<" }));
		ret.add(new Feature("BitMani_Q_>>", new String[] { ">>" }));
		ret.add(new Feature("BitMani_Q_0", new String[] { "0" }));
		ret.add(new Feature("BitMani_Q_1", new String[] { "1" }));
		ret.add(new Feature("BitMani_Q_bit", new String[] { "bit" }));
		ret.add(new Feature("BitMani_Q_bits", new String[] { "bits" }));
		ret.add(new Feature("BitMani_Q_0x", new String[] { "0x" }));
		ret.add(new Feature("BitMani_Q_binary", new String[] { "binary" }));
		ret.add(new Feature("BitMani_Q_odd", new String[] { "odd" }));
		ret.add(new Feature("BitMani_Q_even", new String[] { "even" }));
		
		ret.add(new Feature("BitMani_Q_All", new String[] { "arithmetic", "shift", "left", "right", "digit", "digits",  "and", "or", "xor", "&", "|", "<<", ">>", "0", "1", "bit", "bits", "0x", "binary", "odd", "even" }));
		
		ret.add(new Feature(true,"BitMani_QA_arithmetic", new String[] { "arithmetic" }));
		ret.add(new Feature(true,"BitMani_QA_shift", new String[] { "shift" }));
		ret.add(new Feature(true,"BitMani_QA_left", new String[] { "left" }));
		ret.add(new Feature(true,"BitMani_QA_right", new String[] { "right" }));
		ret.add(new Feature(true,"BitMani_QA_digit", new String[] { "digit" }));
		ret.add(new Feature(true,"BitMani_QA_digits", new String[] { "digits" }));
		ret.add(new Feature(true,"BitMani_QA_and", new String[] { "and" }));
		ret.add(new Feature(true,"BitMani_QA_or", new String[] { "or" }));
		ret.add(new Feature(true,"BitMani_QA_xor", new String[] { "xor" }));
		ret.add(new Feature(true,"BitMani_QA_&", new String[] { "&" }));
		ret.add(new Feature(true,"BitMani_QA_|", new String[] { "|" }));
		ret.add(new Feature(true,"BitMani_QA_<<", new String[] { "<<" }));
		ret.add(new Feature(true,"BitMani_QA_>>", new String[] { ">>" }));
		ret.add(new Feature(true,"BitMani_QA_0", new String[] { "0" }));
		ret.add(new Feature(true,"BitMani_QA_1", new String[] { "1" }));
		ret.add(new Feature(true,"BitMani_QA_bit", new String[] { "bit" }));
		ret.add(new Feature(true,"BitMani_QA_bits", new String[] { "bits" }));
		ret.add(new Feature(true,"BitMani_QA_0x", new String[] { "0x" }));
		ret.add(new Feature(true,"BitMani_QA_binary", new String[] { "binary" }));
		ret.add(new Feature(true,"BitMani_QA_odd", new String[] { "odd" }));
		ret.add(new Feature(true,"BitMani_QA_even", new String[] { "even" }));
		
		ret.add(new Feature(true,"BitMani_QA_All", new String[] { "arithmetic", "shift", "left", "right", "digit", "digits",  "and", "or", "xor", "&", "|", "<<", ">>", "0", "1", "bit", "bits", "0x", "binary", "odd", "even" }));

		return ret;
	}
	
	public List<Feature> AddOODFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("OOD_Q_object", new String[] { "object" }));
		ret.add(new Feature("OOD_Q_oriented", new String[] { "oriented" }));
		ret.add(new Feature("OOD_Q_design", new String[] { "design" }));
		ret.add(new Feature("OOD_Q_class", new String[] { "class" }));
		ret.add(new Feature("OOD_Q_OOD", new String[] { "OOD" }));
		ret.add(new Feature("OOD_Q_type", new String[] { "type" }));
		ret.add(new Feature("OOD_Q_UML", new String[] { "UML" }));
		ret.add(new Feature("OOD_Q_card", new String[] { "card" }));
		ret.add(new Feature("OOD_Q_deck", new String[] { "deck" }));
		ret.add(new Feature("OOD_Q_phone", new String[] { "phone" }));
		ret.add(new Feature("OOD_Q_number", new String[] { "number" }));
		ret.add(new Feature("OOD_Q_parking", new String[] { "parking" }));
		ret.add(new Feature("OOD_Q_method", new String[] { "method" }));
		ret.add(new Feature("OOD_Q_goal", new String[] { "goal" }));
		ret.add(new Feature("OOD_Q_subclass", new String[] { "subclass" }));
		ret.add(new Feature("OOD_Q_extend", new String[] { "extend" }));
		ret.add(new Feature("OOD_Q_implement", new String[] { "implement" }));
		ret.add(new Feature("OOD_Q_puzzle", new String[] { "puzzle" }));
		ret.add(new Feature("OOD_Q_system", new String[] { "system" }));
		
		ret.add(new Feature("OOD_Q_All", new String[] {"object", "oriented", "design", "class", "OOD", "type", "UML", "card", "deck", "phone", "number", "parking", "method", "goal", "subclass", "extend", "implement", "puzzle",  "system"}));
		
		ret.add(new Feature(true,"OOD_QA_object", new String[] { "object" }));
		ret.add(new Feature(true,"OOD_QA_oriented", new String[] { "oriented" }));
		ret.add(new Feature(true,"OOD_QA_design", new String[] { "design" }));
		ret.add(new Feature(true,"OOD_QA_class", new String[] { "class" }));
		ret.add(new Feature(true,"OOD_QA_OOD", new String[] { "OOD" }));
		ret.add(new Feature(true,"OOD_QA_type", new String[] { "type" }));
		ret.add(new Feature(true,"OOD_QA_UML", new String[] { "UML" }));
		ret.add(new Feature(true,"OOD_QA_card", new String[] { "card" }));
		ret.add(new Feature(true,"OOD_QA_deck", new String[] { "deck" }));
		ret.add(new Feature(true,"OOD_QA_phone", new String[] { "phone" }));
		ret.add(new Feature(true,"OOD_QA_number", new String[] { "number" }));
		ret.add(new Feature(true,"OOD_QA_parking", new String[] { "parking" }));
		ret.add(new Feature(true,"OOD_QA_method", new String[] { "method" }));
		ret.add(new Feature(true,"OOD_QA_goal", new String[] { "goal" }));
		ret.add(new Feature(true,"OOD_QA_subclass", new String[] { "subclass" }));
		ret.add(new Feature(true,"OOD_QA_extend", new String[] { "extend" }));
		ret.add(new Feature(true,"OOD_QA_implement", new String[] { "implement" }));
		ret.add(new Feature(true,"OOD_QA_puzzle", new String[] { "puzzle" }));
		ret.add(new Feature(true,"OOD_QA_system", new String[] { "system" }));
		
		ret.add(new Feature(true, "OOD_QA_All", new String[] {"object", "oriented", "design", "class", "OOD", "type", "UML", "card", "deck", "phone", "number", "parking", "method", "goal", "subclass", "extend", "implement", "puzzle",  "system"}));

		return ret;
	}
	
	public List<Feature> AddRecursionFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		ret.add(new Feature("Recursion_Q_recursion", new String[] { "recursion" }));
		ret.add(new Feature("Recursion_Q_recursive", new String[] { "recursive" }));
		ret.add(new Feature("Recursion_Q_sub-problem", new String[] { "sub-problem" }));
		ret.add(new Feature("Recursion_Q_f(n)", new String[] { "f(n)" }));
		ret.add(new Feature("Recursion_Q_bottom-up", new String[] { "bottom-up" }));
		ret.add(new Feature("Recursion_Q_top-down", new String[] { "top-down" }));
		ret.add(new Feature("Recursion_Q_fibonacci", new String[] { "fibonacci" }));
		ret.add(new Feature("Recursion_Q_robot", new String[] { "robot" }));
		ret.add(new Feature("Recursion_Q_subset", new String[] { "subset" }));
		ret.add(new Feature("Recursion_Q_permutation", new String[] { "permutation" }));
		ret.add(new Feature("Recursion_Q_parentheses", new String[] { "parentheses" }));
		
		ret.add(new Feature("StackQueue_Q_All", new String[] { "recursion", "recursive", "sub-problem", "f(n)", "bottom-up", "top-down", "fibonacci", "robot", "subset", "permutation", "parentheses" }));
		
		ret.add(new Feature(true, "Recursion_QA_recursion", new String[] { "recursion" }));
		ret.add(new Feature(true, "Recursion_QA_recursive", new String[] { "recursive" }));
		ret.add(new Feature(true, "Recursion_QA_sub-problem", new String[] { "sub-problem" }));
		ret.add(new Feature(true, "Recursion_QA_f(n)", new String[] { "f(n)" }));
		ret.add(new Feature(true, "Recursion_QA_bottom-up", new String[] { "bottom-up" }));
		ret.add(new Feature(true, "Recursion_QA_top-down", new String[] { "top-down" }));
		ret.add(new Feature(true, "Recursion_QA_fibonacci", new String[] { "fibonacci" }));
		ret.add(new Feature(true, "Recursion_QA_robot", new String[] { "robot" }));
		ret.add(new Feature(true, "Recursion_QA_subset", new String[] { "subset" }));
		ret.add(new Feature(true, "Recursion_QA_permutation", new String[] { "permutation" }));
		ret.add(new Feature(true, "Recursion_QA_parentheses", new String[] { "parentheses" }));
		
		ret.add(new Feature(true, "StackQueue_QA_All", new String[] { "recursion", "recursive", "sub-problem", "f(n)", "bottom-up", "top-down", "fibonacci", "robot", "subset", "permutation", "parentheses" }));
		
		return ret;
	}
	
	public List<Feature> AddSortSearchFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
		
		ret.add(new Feature("SortSearch_Q_sort", new String[] { "sort" }));
		ret.add(new Feature("SortSearch_Q_sorted", new String[] { "sorted" }));
		ret.add(new Feature("SortSearch_Q_sorting", new String[] { "sorting" }));
		ret.add(new Feature("SortSearch_Q_unsorted", new String[] { "unsorted" }));
		ret.add(new Feature("SortSearch_Q_bubble", new String[] { "bubble" }));
		ret.add(new Feature("SortSearch_Q_selection", new String[] { "selection" }));
		ret.add(new Feature("SortSearch_Q_merge", new String[] { "merge" }));
		ret.add(new Feature("SortSearch_Q_mergesort", new String[] { "mergesort" }));
		ret.add(new Feature("SortSearch_Q_quicksort", new String[] { "quicksort" }));
		ret.add(new Feature("SortSearch_Q_bucketsort", new String[] { "bucketsort" }));
		ret.add(new Feature("SortSearch_Q_bucket", new String[] { "bucket" }));
		ret.add(new Feature("SortSearch_Q_search", new String[] { "search" }));

		ret.add(new Feature("SortSearch_QA_All", new String[] { "sort", "sorted", "sorting", "unsorted", "bubble", "selection", "merge", "mergesort", "quicksort", "bucketsort", "bucket", "search" }));
		
		ret.add(new Feature(true, "SortSearch_QA_sort", new String[] { "sort" }));
		ret.add(new Feature(true, "SortSearch_QA_sorted", new String[] { "sorted" }));
		ret.add(new Feature(true, "SortSearch_QA_sorting", new String[] { "sorting" }));
		ret.add(new Feature(true, "SortSearch_QA_unsorted", new String[] { "unsorted" }));
		ret.add(new Feature(true, "SortSearch_QA_bubble", new String[] { "bubble" }));
		ret.add(new Feature(true, "SortSearch_QA_selection", new String[] { "selection" }));
		ret.add(new Feature(true, "SortSearch_QA_merge", new String[] { "merge" }));
		ret.add(new Feature(true, "SortSearch_QA_mergesort", new String[] { "mergesort" }));
		ret.add(new Feature(true, "SortSearch_QA_quicksort", new String[] { "quicksort" }));
		ret.add(new Feature(true, "SortSearch_QA_bucketsort", new String[] { "bucketsort" }));
		ret.add(new Feature(true, "SortSearch_QA_bucket", new String[] { "bucket" }));
		ret.add(new Feature(true, "SortSearch_QA_search", new String[] { "search" }));

		ret.add(new Feature(true, "SortSearch_QA_All", new String[] { "sort", "sorted", "sorting", "unsorted", "bubble", "selection", "merge", "mergesort", "quicksort", "bucketsort", "bucket", "search" }));

		return ret;
	}
	
	public List<Feature> AddJavaFeatures() {
		List<Feature> ret = new ArrayList<Feature>();
	
		ret.add(new Feature("Java_Q_interface", new String[] { "interface" }));
		ret.add(new Feature("Java_Q_extends", new String[] { "extends" }));
		ret.add(new Feature("Java_Q_inheritance", new String[] { "inheritance" }));
		ret.add(new Feature("Java_Q_abstract", new String[] { "abstract" }));
		ret.add(new Feature("Java_Q_final", new String[] { "final" }));
		ret.add(new Feature("Java_Q_try", new String[] { "try" }));
		ret.add(new Feature("Java_Q_catch", new String[] { "catch" }));
		ret.add(new Feature("Java_Q_import", new String[] { "import" }));
		ret.add(new Feature("Java_Q_package", new String[] { "package" }));
		ret.add(new Feature("Java_Q_java", new String[] { "java" }));
		ret.add(new Feature("Java_Q_All", new String[] { "interface", "extends", "inheritance", "abstract", "final", "try", "catch", "import", "package", "java"  }));
		
        ret.add(new Feature(true,"Java_QA_interface", new String[] { "interface" }));
		ret.add(new Feature(true,"Java_QA_extends", new String[] { "extends" }));
		ret.add(new Feature(true,"Java_QA_inheritance", new String[] { "inheritance" }));
		ret.add(new Feature(true,"Java_QA_abstract", new String[] { "abstract" }));
		ret.add(new Feature(true,"Java_QA_final", new String[] { "final" }));
		ret.add(new Feature(true,"Java_QA_try", new String[] { "try" }));
		ret.add(new Feature(true,"Java_QA_catch", new String[] { "catch" }));
		ret.add(new Feature(true,"Java_QA_import", new String[] { "import" }));
		ret.add(new Feature(true,"Java_QA_All", new String[] { "interface", "extends", "inheritance", "abstract", "final", "try", "catch", "import", "package", "java"  }));
		
		return ret;
	}
}
