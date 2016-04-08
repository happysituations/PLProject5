
# parsetab.py
# This file is automatically generated. Do not edit.
_tabversion = '3.8'

_lr_method = 'LALR'

_lr_signature = '6DD851EBFBF22DF8C2EB31E8046F0D91'
    
_lr_action_items = {'Tap':([0,],[1,]),'Drip':([0,],[2,]),'Cling':([0,],[4,]),'Clink':([0,],[5,]),'Whack':([0,],[6,]),'$end':([1,2,3,4,5,6,],[-1,-4,0,-2,-3,-5,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'line1':([0,],[3,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> line1","S'",1,None,None,None),
  ('line1 -> Tap','line1',1,'p_line1','PLYCreepyPoem.py',46),
  ('line1 -> Cling','line1',1,'p_line1','PLYCreepyPoem.py',47),
  ('line1 -> Clink','line1',1,'p_line1','PLYCreepyPoem.py',48),
  ('line1 -> Drip','line1',1,'p_line1','PLYCreepyPoem.py',49),
  ('line1 -> Whack','line1',1,'p_line1','PLYCreepyPoem.py',50),
  ('line2 -> Shoes','line2',1,'p_line2','PLYCreepyPoem.py',60),
  ('line2 -> Keys','line2',1,'p_line2','PLYCreepyPoem.py',61),
  ('line2 -> Cuffs','line2',1,'p_line2','PLYCreepyPoem.py',62),
  ('line2 -> Water','line2',1,'p_line2','PLYCreepyPoem.py',63),
  ('line2 -> A','line2',1,'p_line2','PLYCreepyPoem.py',64),
  ('line2 -> One','line2',1,'p_line2','PLYCreepyPoem.py',65),
]