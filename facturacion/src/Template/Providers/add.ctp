<?php
/**
 * @var \App\View\AppView $this
 * @var \App\Model\Entity\Provider $provider
 */
?>


<div  style="background: #0D1D52;">
            <ul class="nav nav-tabs">
              
                   <li><?= $this->Html->link(__('List Providers'), ['action' => 'index']) ?></li>
                    <li><?= $this->Html->link(__('List Persons'), ['controller' => 'Persons', 'action' => 'index']) ?></li>
                    <li><?= $this->Html->link(__('New Person'), ['controller' => 'Persons', 'action' => 'add']) ?></li>
                    <li><?= $this->Html->link(__('List Products'), ['controller' => 'Products', 'action' => 'index']) ?></li>
                    <li><?= $this->Html->link(__('New Product'), ['controller' => 'Products', 'action' => 'add']) ?></li>
            </ul>
    </div>
</br>


<div class="row">
    <div class="col-md-6 col-md-offset-3">        
        <?= $this->Form->create($provider) ?>
        <fieldset>
            <legend><?= __('Add Provider') ?></legend>
            <?php
                echo $this->Form->control('person_id', ['options' => $persons]);
                echo $this->Form->control('products._ids', ['options' => $products]);
            ?>
        </fieldset>
        <?= $this->Form->button(__('Submit'), ['class' => 'btn btn-info']) ?>
        <?= $this->Form->end() ?>
    </div>
</div>
